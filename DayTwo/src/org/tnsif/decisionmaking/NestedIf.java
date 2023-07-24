//program to demonstrate on bunjee jumping
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=s.nextInt();
		System.out.println("enter the weight");
		int weight=s.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("eligible to bunjee jumping");
				if(weight>=110)
				{
					System.out.println("extra ropes will added");
				}
			}
			else
			{
				System.out.println("not eligible");
			}
		}
		else {
		System.out.println("not eligible");
		}
		s.close();
		
    }

}
