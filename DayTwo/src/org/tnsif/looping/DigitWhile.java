package org.tnsif.looping;

import java.util.Scanner;

public class DigitWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in); 
       int n=s.nextInt();
       int cnt=0;
       do
       {
    	   
    	   n=n/10;
    	   cnt++;
    	   
       }while(n>0);
         
       System.out.println("number of digit:"+cnt);
       
       
	}

}
