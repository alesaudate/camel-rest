package com.alesaudate.sample.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class People implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<Person> person = new ArrayList<>();
	
	public void setPerson(List<Person> person) {
		if (person == null) return;
		this.person = person;
	}
	
	public List<Person> getPerson() {
		return person;
	}
	
	
	

}
