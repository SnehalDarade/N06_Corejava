package org.tnsif.InterfaceExcutor;
//program to demonstrate an interface
public interface Sony {
	//by default all the variable inside an interface is public ,static, final
	int noOfChannel=8;
	//by default all the method inside an onterface abstract method
	void display();
	static void accept()
	{
		System.out.println("static method");
		
	}
	//default method  ,jaav8 provides static and default method inside an interface
	 default void show()
	{
		System.out.println("Default method");
	}
	
	

}
