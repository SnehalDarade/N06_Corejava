package org.tnsif.costomException;
//program to demonstrate on coustom exception
//to use coustom exception extends the exception class(parent)
@SuppressWarnings("serial")
public class LoginCredential extends Exception {
	
	private String str;

	//parameterized constructor
	public LoginCredential(String str) {
		super();
		this.str = str;
	}

	//tostring method
	@Override
	public String toString() {
		return "LoginCredential [str=" + str + "]";
	}

	//getter and setter
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	

}
