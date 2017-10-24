/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.converter;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/**
 * @author wuwenjun
 *
 */
public class EnumConverterFactory implements ConverterFactory<String, BaseEnum> {
	private static final Map<Class<?>, Converter<String, ?>> converterMap = new WeakHashMap<>();

	@Override
	public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
		Converter<String, T> result = (Converter<String, T>) converterMap.get(targetType);
		if (result == null) {
			result = new IntegerStrToEnum<T>(targetType);
			converterMap.put(targetType, result);
		}
		return result;
	}

	class IntegerStrToEnum<T extends BaseEnum> implements Converter<String, T> {
		private Map<String, T> enumMap = new HashMap<>();

		public IntegerStrToEnum(Class<T> enumType) {
			T[] enums = enumType.getEnumConstants();
			for (T e : enums) {
				enumMap.put(e.getOrdinal() + "", e);
			}
		}

		@Override
		public T convert(String source) {
			T result = enumMap.get(source);
			if (result == null) {
				throw new IllegalArgumentException("No element matches " + source);
			}
			return result;
		}
	}

}
