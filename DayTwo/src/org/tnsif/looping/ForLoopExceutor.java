package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopExceutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println("*");
			}
			System.out.println(" ");
		}

	}

}
