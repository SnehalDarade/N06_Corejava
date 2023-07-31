/*
 there are n people standing in circle waiting to be excuted.the counting 
 out begins at some point at circle and prosics around circle in a fix direction
 if it step certain number of people are skiped and next person is excuted.
 the elimination procies around circle (which becomming smaller and smaller as excuted 
 people are removed),until only the last person remains,who is given freedom.
 given the total no of person an no k which indicate that k-1 person are skiped and k 
 person are killed in the circle.task choose the person in the initial circle servives.
 */
package org.tnsif.challenge;

import java.util.Scanner;

public class CircleServiveChallenge {
	
	static int servive(int n,int k)
	{
		if(n==1)
		
			return 1;
		else
		
			return (servive(n-1,k)+k-1)%n+1;
		
	}

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the value of n and k:");
	 int n=s.nextInt();
	 int k=s.nextInt();
     System.out.println(servive(n,k));
	}

}
