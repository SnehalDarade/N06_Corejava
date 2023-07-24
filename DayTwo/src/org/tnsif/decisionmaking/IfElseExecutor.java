//program to demonstate to check the person eligible to donate the blood or not
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=s.nextInt();
		System.out.println("enter your weight:");
		int weight=s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("eligible to donate the blood");
			
		}
		else
		{
			System.out.println("you are not eligible");
		}

	}

}
