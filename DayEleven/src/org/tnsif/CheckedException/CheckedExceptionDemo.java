package org.tnsif.CheckedException;
import java.io.FileInputStream;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try
		{
	      FileInputStream f=new  FileInputStream("C:\\Users\\Snehal\\Downloads\\shopping.txt");
	      System.out.println("file is exist..!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
		}

	}

}
