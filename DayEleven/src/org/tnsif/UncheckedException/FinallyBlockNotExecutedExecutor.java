package org.tnsif.UncheckedException;
//program to demonstrate on 
public class FinallyBlockNotExecutedExecutor {
	static void display(int arr[])
	{
		try {
		System.out.println(arr[3]);
		/*if try and catch block contain a system.exit(0);
		 * after the exception code line,then finally block does not executd*/
		System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled: "+e);
			System.exit(0);
		}
		finally
		{
			//when finally block contain exception code then finally block doesnot executed
			System.out.println(13/0);
			System.out.println("finally block is always executed");
		}
		System.out.println("any statement out of block is always"+" executed");
	}

	public static void main(String[] args) {
		int arr[]= {12,34,56};
		display(arr);

	}

}
