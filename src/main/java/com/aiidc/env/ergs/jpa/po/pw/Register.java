/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.pw;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.aiidc.env.ergs.common.metro.MetroField;
import com.aiidc.env.ergs.common.metro.converter.Converter;
import com.aiidc.env.ergs.constant.CompanyType;
import com.aiidc.env.ergs.constant.ProductType;

/**
 * @author wuwenjun
 *
 */
@Entity
@Table(name = "T_register")
public class Register implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6062515384398276054L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "register_id_seq")
	@SequenceGenerator(name = "register_id_seq", sequenceName = "register_id_seq", allocationSize = 1)
	private Long id;

	@MetroField("开户企业名称")
	private String companyName = "";
	@MetroField("开户企业地址")
	private String companyAddress = "";
	@MetroField("社会信用代码")
	private String creditCode = "";
	@MetroField("省份")
	private String province = "";
	@MetroField("邮编")
	private String zipCode = "";
	@MetroField("电子邮件")
	private String email = "";
	@MetroField("电话")
	private String tel = "";
	@MetroField("传真")
	private String fax = "";
	@MetroField("法定代表")
	private String legalPerson = "";
	@MetroField("负责人")
	private String header = "";
	@MetroField("联系人")
	private String linkman = "";
	@MetroField("集团名称")
	private String groupName = "";
	@MetroField("联系人")
	private String groupLinkman = "";
	@MetroField("电子邮件")
	private String groupEmail = "";
	@MetroField("电话")
	private String groupTel = "";
	@MetroField("传真")
	private String groupFax = "";
	@MetroField(value = "企业类别", convert = Converter.COMPANY_TYPE)
	private CompanyType companyType;

	@ElementCollection(targetClass = ProductType.class, fetch = FetchType.EAGER)
	@CollectionTable(name = "t_company_product", joinColumns = { @JoinColumn(name = "company_id") })
	@Column(name = "product_type")
	@MetroField("产品类别")
	private List<ProductType> productTypes;

	@MetroField("注册时间")
	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;

	@Column(name = "audited")
	private Boolean audited;

	private String manufId = "";

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCreditCode() {
		return creditCode;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupLinkman() {
		return groupLinkman;
	}

	public void setGroupLinkman(String groupLinkman) {
		this.groupLinkman = groupLinkman;
	}

	public String getGroupEmail() {
		return groupEmail;
	}

	public void setGroupEmail(String groupEmail) {
		this.groupEmail = groupEmail;
	}

	public String getGroupTel() {
		return groupTel;
	}

	public void setGroupTel(String groupTel) {
		this.groupTel = groupTel;
	}

	public String getGroupFax() {
		return groupFax;
	}

	public void setGroupFax(String groupFax) {
		this.groupFax = groupFax;
	}

	public CompanyType getCompanyType() {
		return companyType;
	}

	public void setCompanyType(CompanyType companyType) {
		this.companyType = companyType;
	}

	public List<ProductType> getProductTypes() {
		return productTypes;
	}

	public void setProductTypes(List<ProductType> productTypes) {
		this.productTypes = productTypes;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public Boolean getAudited() {
		return audited;
	}

	public void setAudited(Boolean audited) {
		this.audited = audited;
	}

	public String getManufId() {
		return manufId;
	}

	public void setManufId(String manufId) {
		this.manufId = manufId;
	}

}
