package org.tnsif.thiskeydemo;
class Director
{
	String name;
	void print()
	{
		this.name="suni datt";
		display(name);
	}
	void display(String name)
	{
		System.out.println("director name is:"+name);
	}
}
public class ThisKeyDemoFour {

	public static void main(String[] args) {
	Director s=new Director();	
     s.print();
	}

}
