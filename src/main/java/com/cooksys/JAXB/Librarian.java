package com.cooksys.JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Librarian {
	
	@XmlValue
	private String name;
	
	@XmlAttribute
	private String salary;
	
	@XmlAttribute
	private String age;
	
	public Librarian () {}
	
	public Librarian(String n, String s, String a) {
		this.name = n;
		this.salary = s;
		this.age = a;
	}
}
