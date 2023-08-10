package org.tnsif.singlediamentionArray;

public class ArrayOfObject {

	public static void main(String[] args) {
		Student a[]=new Student[3];
		a[0]=new Student(101,"snehal",3564.6);
		a[1]=new Student(102,"sakshi",7884.6);
		a[2]=new Student(103,"karuna",3894.6);
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i].getID()+" "+a[i].getName()+" "+a[i].getSalary());
		}

	}

}
