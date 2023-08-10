package org.tnsif.UncheckedException;

public class ThrowAndThrowsDemo {
 
	static void isEligible(int age,int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("person is eligible to donate the blood");
		}
		else
		{
			//throw keyword is used to throw an exception explicitly
			throw new ArithmeticException("critria is not satisfied");
		}
	}
	public static void main(String[] args) {
		try {
		isEligible(13,56);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
