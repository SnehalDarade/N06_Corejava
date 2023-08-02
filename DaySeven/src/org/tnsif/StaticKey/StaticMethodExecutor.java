package org.tnsif.StaticKey;

public class StaticMethodExecutor {
	static float percentage=23.65f;
	//static methos
	//if any method outside the main fun if you want to access that method inside the main fun make it as static
	
	static void displayScore(int Score) {
		/* we cant use non-static variable inside static method*/
		System.out.println(percentage);
		System.out.println("Score is:"+Score);
	}

	public static void main(String[] args) {
		
		displayScore(34);

	}

}
