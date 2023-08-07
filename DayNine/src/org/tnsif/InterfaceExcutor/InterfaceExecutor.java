package org.tnsif.InterfaceExcutor;
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we cant instantiate an interface
		//Sony s=new Sony();
		
		SonyTV s=new SonyTV();
		s.display();
		s.show();
		Sony.accept();

		ISRO p=new ISRO();
		p.status();
		
		Human r=new Human();
		r.showDrink();
		
	}
}
//functional interface use only one abstract class
//we use for lamda expression,we can reduce the lenght of code.