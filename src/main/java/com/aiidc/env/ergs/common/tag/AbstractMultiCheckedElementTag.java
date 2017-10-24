/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.tag;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.jsp.JspException;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.tags.form.AbstractCheckedElementTag;
import org.springframework.web.servlet.tags.form.TagWriter;

/**
 * @author wuwenjun
 *
 */
public abstract class AbstractMultiCheckedElementTag extends AbstractCheckedElementTag {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String SPAN_TAG = "label class='input-control radio'";
	private Object items;
	private String itemValue;
	private String itemLabel;
	private String element = SPAN_TAG;
	private String delimiter;

	public void setItems(Object items) {
		Assert.notNull(items, "'items' must not be null");
		this.items = items;
	}

	protected Object getItems() {
		return this.items;
	}

	public void setItemValue(String itemValue) {
		Assert.hasText(itemValue, "'itemValue' must not be empty");
		this.itemValue = itemValue;
	}

	protected String getItemValue() {
		return this.itemValue;
	}

	public void setItemLabel(String itemLabel) {
		Assert.hasText(itemLabel, "'itemLabel' must not be empty");
		this.itemLabel = itemLabel;
	}

	protected String getItemLabel() {
		return this.itemLabel;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	public String getDelimiter() {
		return this.delimiter;
	}

	public void setElement(String element) {
		Assert.hasText(element, "'element' cannot be null or blank");
		this.element = element;
	}

	public String getElement() {
		return this.element;
	}

	protected String resolveId() throws JspException {
		Object id = evaluate("id", getId());
		if (id != null) {
			String idString = id.toString();
			return StringUtils.hasText(idString) ? TagIdGenerator.nextId(idString, this.pageContext) : null;
		}
		return autogenerateId();
	}

	protected int writeTagContent(TagWriter tagWriter) throws JspException {
		Object items = getItems();
		Object itemsObject = (items instanceof String) ? evaluate("items", items) : items;

		String itemValue = getItemValue();
		String itemLabel = getItemLabel();

		String valueProperty = itemValue != null ? ObjectUtils.getDisplayString(evaluate("itemValue", itemValue))
				: null;

		String labelProperty = itemLabel != null ? ObjectUtils.getDisplayString(evaluate("itemLabel", itemLabel))
				: null;

		Class<?> boundType = getBindStatus().getValueType();
		if ((itemsObject == null) && (boundType != null) && (boundType.isEnum())) {
			itemsObject = boundType.getEnumConstants();
		}

		if (itemsObject == null) {
			throw new IllegalArgumentException(
					"Attribute 'items' is required and must be a Collection, an Array or a Map");
		}

		if (itemsObject.getClass().isArray()) {
			Object[] itemsArray = (Object[]) itemsObject;
			for (int i = 0; i < itemsArray.length; i++) {
				Object item = itemsArray[i];
				writeObjectEntry(tagWriter, valueProperty, labelProperty, item, i);
			}
		} else if ((itemsObject instanceof Collection)) {
			Collection<?> optionCollection = (Collection<?>) itemsObject;
			int itemIndex = 0;
			for (Iterator<?> it = optionCollection.iterator(); it.hasNext(); itemIndex++) {
				Object item = it.next();
				writeObjectEntry(tagWriter, valueProperty, labelProperty, item, itemIndex);
			}
		} else if ((itemsObject instanceof Map)) {
			Map<?, ?> optionMap = (Map<?, ?>) itemsObject;
			int itemIndex = 0;
			for (Iterator<?> it = optionMap.entrySet().iterator(); it.hasNext(); itemIndex++) {
				Map.Entry<?, ?> entry = (Map.Entry<?, ?>) it.next();
				writeMapEntry(tagWriter, valueProperty, labelProperty, entry, itemIndex);
			}
		} else {
			throw new IllegalArgumentException("Attribute 'items' must be an array, a Collection or a Map");
		}

		return 0;
	}

	private void writeObjectEntry(TagWriter tagWriter, String valueProperty, String labelProperty, Object item,
			int itemIndex) throws JspException {
		BeanWrapper wrapper = PropertyAccessorFactory.forBeanPropertyAccess(item);
		Object renderValue;
		if (valueProperty != null) {
			renderValue = wrapper.getPropertyValue(valueProperty);
		} else {
			if ((item instanceof Enum)) {
				renderValue = ((Enum<?>) item).name();
			} else
				renderValue = item;
		}
		Object renderLabel = labelProperty != null ? wrapper.getPropertyValue(labelProperty) : item;
		writeElementTag(tagWriter, item, renderValue, renderLabel, itemIndex);
	}

	private void writeMapEntry(TagWriter tagWriter, String valueProperty, String labelProperty, Map.Entry<?, ?> entry,
			int itemIndex) throws JspException {
		Object mapKey = entry.getKey();
		Object mapValue = entry.getValue();
		BeanWrapper mapKeyWrapper = PropertyAccessorFactory.forBeanPropertyAccess(mapKey);
		BeanWrapper mapValueWrapper = PropertyAccessorFactory.forBeanPropertyAccess(mapValue);

		Object renderValue = valueProperty != null ? mapKeyWrapper.getPropertyValue(valueProperty) : mapKey.toString();

		Object renderLabel = labelProperty != null ? mapValueWrapper.getPropertyValue(labelProperty)
				: mapValue.toString();
		writeElementTag(tagWriter, mapKey, renderValue, renderLabel, itemIndex);
	}

	private void writeElementTag(TagWriter tagWriter, Object item, Object value, Object label, int itemIndex)
			throws JspException {
		tagWriter.startTag(getElement());
		if (itemIndex > 0) {
			Object resolvedDelimiter = evaluate("delimiter", getDelimiter());
			if (resolvedDelimiter != null) {
				tagWriter.appendValue(resolvedDelimiter.toString());
			}
		}
		tagWriter.startTag("input");
		String id = resolveId();
		writeOptionalAttribute(tagWriter, "id", id);
		writeOptionalAttribute(tagWriter, "name", getName());
		writeOptionalAttributes(tagWriter);
		tagWriter.writeAttribute("type", getInputType());
		renderFromValue(item, value, tagWriter);
		tagWriter.endTag();
		tagWriter.startTag("span");
		tagWriter.writeAttribute("class", "check");
		tagWriter.appendValue("");
		tagWriter.endTag();
		tagWriter.startTag("span");
		tagWriter.writeAttribute("class", "caption");
		tagWriter.appendValue(convertToDisplayString(label));
		tagWriter.endTag();
		tagWriter.endTag();
	}

	protected void renderFromValue(Object item, Object value, TagWriter tagWriter) throws JspException {
		Object actualValue = getBoundValue();
		if (actualValue instanceof String && ((String) actualValue).contains(",")) {
			Set<String> actualValues = new HashSet<String>(Arrays.asList(((String) actualValue).split(",")));
			String displayValue = convertToDisplayString(value);
			tagWriter.writeAttribute("value", processFieldValue(getName(), displayValue, getInputType()));
			if (actualValues.contains(value)) {
				tagWriter.writeAttribute("checked", "checked");
			}
		} else {
			super.renderFromValue(item, value, tagWriter);
		}

	}

}
