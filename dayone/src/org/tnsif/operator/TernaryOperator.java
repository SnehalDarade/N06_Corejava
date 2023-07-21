package org.tnsif.operator;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String result=(num%2==0)?"even":"odd";
		System.out.println("result is:"+result);
		s.close();
		

	}

}
