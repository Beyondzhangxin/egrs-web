/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.manager;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.util.StringUtils;

/**
 * @author wuwenjun
 *
 */
public class QryPageVo {

	/**
	 * 当前页（从0开始）
	 */
	private Integer pageNum = 0;

	/**
	 * 每页条数
	 */
	private Integer pageSize = 15;

	/**
	 * 排序方向
	 */
	private String direction;

	/**
	 * 排序字段
	 */
	private String sortType;

	/**
	 * 获取分页对象参数
	 * 
	 * @return
	 */
	public PageRequest pageRequest() {
		Sort sort = null;
		if (StringUtils.isEmpty(sortType)) {
			return new PageRequest(pageNum, pageSize);
		} else if (StringUtils.isEmpty(direction)) {
			sort = new Sort(Direction.ASC, sortType);
			return new PageRequest(pageNum, pageSize, sort);

		} else {
			if (Direction.ASC.equals(direction)) {
				sort = new Sort(Direction.ASC, sortType);
			} else {
				sort = new Sort(Direction.DESC, sortType);
			}
			return new PageRequest(pageNum, pageSize, sort);
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

}
