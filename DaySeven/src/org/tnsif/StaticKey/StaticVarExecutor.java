package org.tnsif.StaticKey;

public class StaticVarExecutor {
	String str="tns india foundation";
   /* if any variable is outside the main function and if you  want to access that variable inside 
      the main function then,make the variable static*/
	public static void main(String[] args) {
		
		StaticVarExecutor s=new StaticVarExecutor();
		System.out.println("string:"+s.str);
		

	}

}
