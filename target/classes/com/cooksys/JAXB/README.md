XSD Modification
---
In this assignment, students will create an XML Schema Definition to match the format of a given library xml. Specifically, students will write JAXB classes that can generate the given library xml and then generate an XSD file for submission.

## Tasks
---
Students will create the following classes:

#### Library
The library class is the root element of the xml file. It should contain:
 - [ ] name
 - [ ] librarians
 - [ ] authors

#### Librarian
The Librarian class describes a librarian who is employed at a library. It should contain:
 - [ ] age
 - [ ] salary
 - [ ] name

#### Author
The author class describes an author. It should contain:
 - [ ] name
 - [ ] book

#### Book
The book class describes a book. It should contain:
 - [ ] genre
 - [ ] date
 - [ ] name


## Task List
- [ ] Create the “Library” class and annotate it using JAXB
- [ ] Create the “Librarian” class and annotate it using JAXB
- [ ] Create the "Author" class and annotate it using JAXB
- [ ] Create the "Book" class and annotate it using JAXB
- [ ] Write a main method that will generate a “Library.xml” file in the working directory
- [ ] Compare this file to the supplied example
- [ ] Generate a new .xsd file to the working directory
- [ ] Submit the generated .xsd file on Schoology
