package org.tnsif.AbstractKeyword;

public abstract class Sandwich {
	
	//concrete method
	void showRecipe()
	{
		System.out.println("i dont know how to "+"prepare sandwich");
	}
	//abstract method
	abstract void prepare();

}
