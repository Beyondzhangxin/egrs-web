/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.pw;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 * @author wuwenjun
 *
 */
@Entity
@Table(name = "T_MENU")
public class Permission implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -552067765749451033L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_id_seq")
	@SequenceGenerator(name = "menu_id_seq", sequenceName = "menu_id_seq", allocationSize = 1)
	@Column(name = "permission_id")
	private Long permissionId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private Permission parent;

	@Column(name = "permission_name", nullable = false, length = 32)
	private String name;

	@Column(name = "code", nullable = false, length = 32)
	private String code;

	private String url;
	@Column(name = "permission_order", nullable = false)
	private int order = 0;

	private boolean operation = false;// 操作标识

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parent")
	@OrderBy("order")
	private List<Permission> children = new ArrayList<Permission>();

	public Permission getParent() {
		return parent;
	}

	public void setParent(Permission parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public List<Permission> getChildren() {
		return children;
	}

	public void setChildren(List<Permission> children) {
		this.children = children;
	}

	public boolean isOperation() {
		return operation;
	}

	public void setOperation(boolean operation) {
		this.operation = operation;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

}
