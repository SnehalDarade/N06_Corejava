package org.tnsif.UncheckedException;
//program to demostarte on catch block with multiple exception
public class CatchBlockDemo {
    static void print(int arr[])
	{
		try
		{
			
			System.out.println(arr[3]);
		}
		catch(ArithmeticException| NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled:"+e);
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {12,34,56};
		CatchBlockDemo.print(arr);

	}

}
