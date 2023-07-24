//program to demonstrate cascaded if-else statement
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method 
      Scanner s=new Scanner(System.in);
      System.out.println("enter the age1:");
      int age1=s.nextInt();
      System.out.println("enter the age2:");
      int age2=s.nextInt();
      System.out.println("enter the age3:");
      int age3=s.nextInt();
      if(age1>age2 && age1>age3)
      {
    	  System.out.println("age1 is greter");
      }
      else if(age2>age1 && age2>age3)
      {
    	  System.out.println("age2 is greter");
      }
      else 
      {
    	  System.out.println("age3 is greter");
      }
      
	}

}
