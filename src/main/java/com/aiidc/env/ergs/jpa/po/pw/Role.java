/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.pw;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author wuwenjun
 *
 */
@Entity
@Table(name = "T_role")
public class Role implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -552067765749451033L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_id_seq")
	@SequenceGenerator(name = "role_id_seq", sequenceName = "role_id_seq", allocationSize = 1)
	@Column(name = "role_id")
	private Long id;

	@Column(name = "role_name", nullable = false, length = 32)
	private String name;

	@Column(name = "role_desc", length = 255)
	private String desc;

	@OneToMany(targetEntity = Permission.class, cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinTable(name = "t_role_permission", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"), inverseJoinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "permission_id", unique = true))
	private Set<Permission> menus = new HashSet<Permission>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Set<Permission> getMenus() {
		return menus;
	}

	public void setMenus(Set<Permission> menus) {
		this.menus = menus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
