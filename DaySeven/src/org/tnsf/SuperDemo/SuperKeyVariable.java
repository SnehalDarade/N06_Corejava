//program to demonstrate on super keyword with variable.
package org.tnsf.SuperDemo;
class Building
{
	int floors=23;
	String name="Anantha-astha";
}
class Flat extends Building
{
	String name="snehal darade";
	void print()
	{
		/* if parent class and child class var name same and if you want to access parent class variable inside
		    child class,use super.variablename*/
		System.out.println(super.name);
	}
}
public class SuperKeyVariable {

	public static void main(String[] args) {
		Flat s=new Flat();
		System.out.println(s.name);
		s.print();

	}

}
