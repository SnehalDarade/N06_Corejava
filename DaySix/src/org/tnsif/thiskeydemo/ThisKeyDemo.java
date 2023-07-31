//program to demonstrate on this keyword used to refer current instance of the class
package org.tnsif.thiskeydemo;
class Account
{
	long accno;
	void setData (long accno)
	{
		this.accno=accno;
	}
	void display()
	{
		System.out.println(accno);
	}
}

public class ThisKeyDemo {

	public static void main(String[] args) {
		Account s=new Account();
		s.setData(34566666677L);
		s.display();
     
	}

}
