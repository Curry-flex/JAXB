package com.jaxb.manipulation.entity;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;




@XmlRootElement
@XmlType(propOrder = {"firstChild","secondChild","data"})
public class Parent {
 
	private FirstChild firstChild;
	private SecondChild secondChild;
	private Data data;
	
	
	
	
	public FirstChild getFirstChild() {
		return firstChild;
	}
	
	@XmlElement
	public void setFirstChild(FirstChild firstChild) {
		this.firstChild = firstChild;
	}
	public SecondChild getSecondChild() {
		return secondChild;
	}
	
	@XmlElement
	public void setSecondChild(SecondChild secondChild) {
		this.secondChild = secondChild;
	}

	public Data getData() {
		return data;
	}
    
	@XmlElement
	public void setData(Data data) {
		this.data = data;
	}

	
	
	
	
	
}
