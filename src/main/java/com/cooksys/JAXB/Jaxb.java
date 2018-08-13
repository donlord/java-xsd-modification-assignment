package com.cooksys.JAXB;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;

public class Jaxb {

	public static Marshaller createMarshaller(JAXBContext context) {
		try {
			return context.createMarshaller();
		} catch (JAXBException e) {
			System.out.println("Failed to create marshaller");
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

		// harry potter books
		Book hpbook1 = new Book("fantasy", "1997", "Harry Potter and the Sorcerer's Stone");
		Book hpbook2 = new Book("fantasy", "1998", "Harry Potter and the Chamber of Secrets");
		Book hpbook3 = new Book("fantasy", "1999", "Harry Potter and the Prisoner of Azkaban");
		Book hpbook4 = new Book("fantasy", "2000", "Harry Potter and the Goblet of Fire");
		Book hpbook5 = new Book("fantasy", "2003", "Harry Potter and the Order of the Pheonix");
		Book hpbook6 = new Book("fantasy", "2005", "Harry Potter and the Half Blood Prince");
		Book hpbook7 = new Book("fantasy", "2007", "Harry Potter and the Deathly Hallows");

		// patrick rothfuss books
		Book prbook1 = new Book("fantasy", "2007", "The name of the Wind");
		Book prbook2 = new Book("fantasy", "2011", "The Wise Man's Fear");
		Book prbook3 = new Book("fantasy", "2014", "The Slow Regard of Silent Things");

		// librarian objs
		Librarian l1 = new Librarian("Samantha North", "32119", "27");
		Librarian l2 = new Librarian("Bill Johnson", "60398", "62");

		// class arrays
		Librarian[] librarians = new Librarian[] { l1, l2 };
		Book[] hpbooks = new Book[] { hpbook1, hpbook2, hpbook3, hpbook4, hpbook5, hpbook6, hpbook7, };
		Book[] prbooks = new Book[] { prbook1, prbook2, prbook3 };

		// Author objs
		Author a1 = new Author("J.k. Rowling", hpbooks);
		Author a2 = new Author("Patrick ROthfuss", prbooks);

		Author[] authors = new Author[] { a1, a2 };

		Library library = new Library("Memphis Library", librarians, authors);

		// generate xml file
		// create jaxb context -> marshall -> file outputstream -> generatescema class
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(Library.class, Librarian.class, Author.class, Book.class);
		} catch (JAXBException e) {
			System.out.println("Failed to create JAXBContext");
			e.printStackTrace();
		}
		//marshall file for xml output
		Marshaller m = createMarshaller(context);
		File file = new File("output.xml");
		try{
			m.setProperty(m.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(library, file);
			System.out.println("file was made");
		}
		catch (JAXBException e) {
			System.out.println("Failed to marshall lib Object:");
			e.printStackTrace();
		}
		
		//generate xsd
		try {
			context.generateSchema(new MySchemaOutputResolver("output.xsd"));
			System.out.println("xsd created");
		} catch (IOException e) {
			System.out.println("Something when wrong when trying to create xsd File:");
			e.printStackTrace();
		}

		
		

	}

}
