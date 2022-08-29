package com.jaxb.manipulation.entity;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Data {

	 private Set<Transactions> trxn;

	public Set<Transactions> getTrxn() {
		return trxn;
	}

	@XmlElement
	public void setTrxn(Set<Transactions> trxn) {
		this.trxn = trxn;
	}
	 
	 
}
