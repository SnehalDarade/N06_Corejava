package org.tnsif.singlediamentionArray;
//program to demonstrate of array of an object
public class Student {
      private int ID;
      private String name;
      private double Salary;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	//parameterized constuctor
	public Student(int iD, String name, double salary) {
		super();
		ID = iD;
		this.name = name;
		Salary = salary;
	}
      
}
//anagram quetions
