package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("which song would you like to listen:");
		int song=s.nextInt();
		switch(song)
		{
		   case 1:
			   System.out.println("hum sath");
			   break;
		   case 2:
			   System.out.println("waka waka");
			   break;
		   case 3:
			   System.out.println("jai shree ram");
			   break;
		   default:
		   {
			   System.out.println("om sai ram");
		   }
		   	   
			
		}

	}

}
