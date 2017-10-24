/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.metro.converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aiidc.env.ergs.common.metro.vo.LableValueVo;
import com.aiidc.env.ergs.constant.CompanyType;

/**
 * @author wuwenjun
 *
 */
public enum Converter {
	NULL {
		@Override
		public Object converterView(Object object) {
			return object;
		}

		@Override
		public List<LableValueVo> data() {
			return new ArrayList<LableValueVo>();
		}

	},
	CHART_BOOLEAN {
		@Override
		public Object converterView(Object object) {
			if (object instanceof Character) {
				if (map().containsKey(String.valueOf(object))) {
					return map().get(String.valueOf(object));
				}
			}
			return object;
		}

		@Override
		public List<LableValueVo> data() {
			ArrayList<LableValueVo> values = new ArrayList<LableValueVo>();
			values.add(new LableValueVo("是", "Y"));
			values.add(new LableValueVo("否", "N"));
			return values;
		}

	},
	COMPANY_TYPE {
		@Override
		public Object converterView(Object object) {
			if (object instanceof CompanyType) {
				return ((CompanyType) object).getValue();
			}
			return object;
		}

		@Override
		public List<LableValueVo> data() {
			return CompanyType.data();
		}

	};
	public abstract Object converterView(Object object);

	public abstract List<LableValueVo> data();

	public Map<String, String> map() {
		Map<String, String> map = new HashMap<String, String>();
		for (LableValueVo vo : data()) {
			map.put(vo.getValue(), vo.getLable());
		}
		return map;
	};
}
