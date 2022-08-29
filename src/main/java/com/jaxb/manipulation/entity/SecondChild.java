package com.jaxb.manipulation.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class SecondChild {
 private String email;
 private String streetNo;
 private String mobile;
 
 
	public String getEmail() {
		return email;
	}
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getStreetNo() {
		return streetNo;
	}
	@XmlElement
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getMobile() {
		return mobile;
	}
	@XmlElement
	public void setMobile(String mobile) {
		this.mobile = mobile;
	} 
 
 
 
}
