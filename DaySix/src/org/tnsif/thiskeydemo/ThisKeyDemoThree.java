package org.tnsif.thiskeydemo;
class Team
{
	int size;
	Team()
	{
		this(7);
		System.out.println("default constuctor");
	}
	Team(int size)
	{
		System.out.println("parametrized constructor: "+size);
	}
}

public class ThisKeyDemoThree {

	public static void main(String[] args) {
		Team s=new Team();
		Team t=new Team(10);
		

	}

}
