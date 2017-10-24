/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.metro;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Id;

import com.aiidc.env.ergs.common.metro.vo.LableValueVo;

/**
 * @author wuwenjun
 *
 */
public class MetroUtil {
	public static MetroMessage[] getMetroMessage(Object item) {
		Class<?> clazz = null;
		if (item instanceof Class<?>) {
			clazz = (Class<?>) item;
		} else {
			clazz = item.getClass();
		}
		Field[] fields = clazz.getDeclaredFields();
		List<MetroMessage> messages = new ArrayList<MetroMessage>();
		for (Field field : fields) {
			MetroField metroField = field.getAnnotation(MetroField.class);
			if (metroField != null) {
				MetroMessage message = new MetroMessage(metroField, field.getName());
				messages.add(message);
			}
		}
		Collections.sort(messages);
		return messages.toArray(new MetroMessage[messages.size()]);
	}

	public static MetroMessage getMetroMessage(Class<?> item, String fieldExp) {
		Field[] fields = item.getDeclaredFields();
		for (Field field : fields) {
			MetroField metroField = field.getAnnotation(MetroField.class);
			if (field.getName().equals(fieldExp)) {
				if (metroField != null) {
					return new MetroMessage(metroField, field.getName());
				} else {
					return null;
				}
			}
		}
		return null;
	}

	public static Object getFieldValue(Object item, MetroMessage message) {
		if (message == null) {
			return null;
		}
		Field[] fields = item.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.getName().equals(message.getField())) {
				try {
					field.setAccessible(true);
					Object value = field.get(item);
					return message.getConverter().converterView(value);
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			}
		}
		return null;
	}

	public static List<LableValueVo> getFieldData(MetroMessage message) {
		if (message == null || message.getConverter() == null) {
			return null;
		}
		return message.getConverter().data();
	}

	public static String getIdField(Object item) {
		Field[] fields = item.getClass().getDeclaredFields();
		for (Field field : fields) {
			Id id = field.getDeclaredAnnotation(Id.class);
			if (id != null) {
				return field.getName();
			}
		}
		return null;
	}

	public static Object getIdValue(Object item) {
		Field[] fields = item.getClass().getDeclaredFields();
		for (Field field : fields) {
			Id id = field.getDeclaredAnnotation(Id.class);
			if (id != null) {
				try {
					field.setAccessible(true);
					return field.get(item);
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			}
		}
		return null;
	}

	public static MetroField[] getMetroField(Class<?> item) {
		Field[] fields = item.getDeclaredFields();
		List<MetroField> messages = new ArrayList<MetroField>();
		for (Field field : fields) {
			MetroField metroField = field.getAnnotation(MetroField.class);
			if (metroField != null) {
				messages.add(metroField);
			}
		}
		return messages.toArray(new MetroField[messages.size()]);
	}
}
