package org.tnsif.UncheckedException;
//program to demonstrate arrayIndexOutOfBound with finally
public class ArrayIndexOutOfBoundExecutor {
     
	static void display(int arr[])
	{
		try {
		System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled: "+e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
		System.out.println("any statement out of block is always"+" executed");
	}
	public static void main(String[] args) {
		int arr[]= {12,34,56};
		display(arr);
	}

}
