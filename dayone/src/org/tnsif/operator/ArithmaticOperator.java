package org.tnsif.operator;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of num1");
	    int num1=s.nextInt();
	    System.out.println("enter the value of num2");
	    int num2=s.nextInt();
		System.out.println("Addition is:"+num1+num2);
		System.out.println("subtraction is:"+(num1-num2));
		System.out.println("division is:"+num1/num2);
		System.out.println("modulus is:"+num1%num2);
		s.close();
		
		

	}

}
