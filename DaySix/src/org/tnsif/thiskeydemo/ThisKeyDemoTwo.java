package org.tnsif.thiskeydemo;
class Bank
{
	long accno;
	Bank(long accno)
	{
		this.accno=accno;
		
	}
	void display()
	{
		System.out.println(accno);
	}
}

public class ThisKeyDemoTwo {

	public static void main(String[] args) {
		Bank s=new Bank(4445654343L);
		s.display();
		
	}

}
