package org.tnsif.AbstractKeyword;

public class AbstractExecutor {

	public static void main(String[] args) {
		//we cant create the object of abstract class
		//Sandwich s=new Sandwich();
         CheeseSandwich s=new CheeseSandwich();
         s.prepare();
         s.showRecipe();
	}

}
