package org.tnsif.costomException;

import java.util.Scanner;

public class CoustomExecutor {

	public static void main(String[] args) throws LoginCredential
	{
	  Scanner s=new Scanner(System.in);
	  String userid=s.nextLine();
	  String password=s.nextLine();
	  try
	  {
	  if(userid.equals("snehal@tnsif.org") && password.equals("pass@123)"))
	  {
		  System.out.println("Credential are matched !!!");
	  }
	  else
	  {
		  throw new LoginCredential("Invalid Credential");
	  }
	  }
	  catch(LoginCredential e)
	  {
		  System.out.println("Exception Handled!!!"+e);
	  }
	}
	

}
