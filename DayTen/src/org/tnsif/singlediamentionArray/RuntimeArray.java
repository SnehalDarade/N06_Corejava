package org.tnsif.singlediamentionArray;
import java.util.Arrays;
//program to demonstrate run time input values and find max element
import java.util.Scanner;

public class RuntimeArray {

	public static void main(String[] args) {
		int max;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array elements:");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are:");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");
		}
		max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		System.out.println("largest element:"+max);
		Arrays.sort(a);
		System.out.println("sorted elements are:");
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
