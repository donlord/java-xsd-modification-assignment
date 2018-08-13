package com.cooksys.JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Library {
	
	@XmlElement
	private String name;
	
	@XmlElementWrapper
	@XmlElement(name="librarian")
	private Librarian [] librarians;
	
	@XmlElementWrapper
	@XmlElement(name="author")
	private Author [] authors;
	
	public Library () {}
	
	public Library(String n, Librarian[]l, Author [] a) {
		this.name = n;
		this.librarians = l;
		this.authors = a;
	}
}
