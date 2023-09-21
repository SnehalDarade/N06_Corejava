package org.tnsif.PolymorphismDemo;
class ChiefMinister
{
	 static void corruption(String str1,float amount)
	{
		System.out.println(str1+" "+"corrupted the amount of :"+" "+amount);
	}
}
class MLA extends ChiefMinister
{

	 static void corruption(String str2,float amount2)
	{
		ChiefMinister.corruption("eknath shinde",3455654.6543f);
		System.out.println(str2+"corrupted the amount of:"+amount2);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		MLA.corruption("wertyu uyrgfty",46787.98f);

	}

}
