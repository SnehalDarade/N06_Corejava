package org.tnsif.PolymorphismDemo;

class Bollywood
{
      static String ShowCouple(String str1,String str2)
	{
		return str1+" "+"loves"+" "+str2;
	}
	 static String ShowCouple(String str1,String str2,String str3)
	{
		return str1+" " +"loves"+ " " +str2+" " +"as well as "+" " +str3;
	}
}
public class MethodOverloading {

	public static  void main(String[] args) {
	 System.out.println( Bollywood.ShowCouple("salman","Aishwaraya"));
     System.out.println(Bollywood.ShowCouple("salman","Aishwaraya","katrina"));
	}

}

