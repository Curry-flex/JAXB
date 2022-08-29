package com.jaxb.manipulation.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transactions {

	 private int amount;
	 private String date;
	 
	 
	public int getAmount() {
		return amount;
	}
	@XmlElement
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	
	@XmlElement
	public void setDate(String date) {
		this.date = date;
	}
     
	 
}
