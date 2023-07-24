package org.tnsif.operator;

public class IncreDrecrOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=23;
		int y=6;
		int res1=x++ + ++y;  //23+7
		System.out.println(res1);
		System.out.println(x);//24
		System.out.println(y);//7
		
		int res2=x-- + --y; //24+6
		System.out.println(res2);
		System.out.println(x);//23
		System.out.println(y);//6

	}

}
