package com.aiidc.env.ergs.jpa.po.yzx.plan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "PUB_KEYID",schema="yzxuser")
public class PubKeyId {
	private static final long serialVersionUID = 1L;
	@Id
	private String keyname;

    private Integer keyvalue;

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname == null ? null : keyname.trim();
    }

    public Integer getKeyvalue() {
        return keyvalue;
    }

    public void setKeyvalue(Integer keyvalue) {
        this.keyvalue = keyvalue;
    }
}
