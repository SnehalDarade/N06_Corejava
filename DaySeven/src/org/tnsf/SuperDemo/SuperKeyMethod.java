package org.tnsf.SuperDemo;
class MET
{
	String ownerName="chagan bhujbal";
	void displayName()
	{
		System.out.println("owner is:"+ownerName);
	}
}
class BKC extends MET
{
	String ownerName="shefali bhujbal";
	void displayName()
	{
		/* if parent class and child class method name are same and if you want access that method
		   inside the child clsss use super.method name*/
		super.displayName();
		System.out.println("owner is:"+ownerName);
	}
}
public class SuperKeyMethod {

	public static void main(String[] args) {
		BKC s=new BKC();
		s.displayName();

	}

}
