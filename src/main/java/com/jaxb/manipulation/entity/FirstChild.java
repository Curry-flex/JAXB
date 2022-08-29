package com.jaxb.manipulation.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FirstChild {
	
	private String fname;
	private String mName;
	private String lname;
	
	
	public String getFname() {
		return fname;
	}
	
	@XmlElement
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getmName() {
		return mName;
	}
	
	@XmlElement
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getLname() {
		return lname;
	}
	
	@XmlElement
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
	
}
