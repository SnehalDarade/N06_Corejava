//program to demonstrate on default and parameterized constructor
package org.tnsif.classandobject;
public class Library {
	public long noofbooks;
	public String authorname;
	public String bookname;
	public double price;
	
	public Library() {
		System.out.println("default constuctor");
	}
	
	public Library(long noofbooks, String authorname, String bookname, double price) {
		super();
		this.noofbooks = noofbooks;
		this.authorname = authorname;
		this.bookname = bookname;
		this.price = price;
		System.out.println("parameterized constuctor");
	}

	@Override
	public String toString() {
		return "Library [noofbooks=" + noofbooks + ", authorname=" + authorname + ", bookname=" + bookname + ", price="
				+ price + "]";
	}
	
	
	

}
