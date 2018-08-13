package com.cooksys.JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Author {
	
	@XmlAttribute
	private String name;
	
	//@XmlElementWrapper
	@XmlElement(name="book")
	private Book [] book;
	
	public Author () {}
	
	public Author (String n, Book[] b) {
		this.name = n;
		this.book = b;
	}
}
