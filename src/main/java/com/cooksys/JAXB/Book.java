package com.cooksys.JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Book {
	
	@XmlAttribute
	private String genre;
	
	@XmlAttribute
	private String date;
	
	@XmlValue
	private String name;
	
	public Book () {}
	
	public Book(String g, String d, String n) {
		this.genre = g;
		this.date = d;
		this.name = n;
	}
}
