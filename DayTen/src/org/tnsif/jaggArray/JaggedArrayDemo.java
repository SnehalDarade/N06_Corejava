package org.tnsif.jaggArray;
//program to demonstrate jagged array
import java.util.Scanner;
public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//declaration of jagged array
        int arr[][]=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[1];
        arr[2]=new int[3];
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<arr[i].length;j++)
        	{
        	    arr[i][j]=s.nextInt();	
        	}
        }
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<arr[i].length;j++)
        	{
        	    System.out.print(arr[i][j]+" ");	
        	}
        	System.out.println();	
        }
	}
}
/* given an array nums of n interger where n>1 return an array output such that 
 * output of ith index=product of all element of nums except nums of ith index.
 * [1,2,3,4]=i/p,o/p=[24,12,8,6]
 * anagram quetion without collection*/
