package org.tnsif.InterfaceExcutor;

public class Human implements ColdDrink,AlcoholDrink {

	@Override
	public void showDrink() {
		System.out.println(colddrinkName+" "+AlcoholType+" "+ brand);
		
		
	
	}

}
