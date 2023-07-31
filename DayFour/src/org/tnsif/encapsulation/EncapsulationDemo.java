package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFS s=new HDFS();
		s.setAccType("saving account");
		s.setAccountNo(65879475464L);
		s.setAtmCardNo(734737467746L);
		s.setPinNo(1234);
		
		//calling toString method
		/*
		System.out.println("account no is:"+s.getAccountNo());
		system.out.println("account type is:"+s.getAccType());
		System.out.println("atmcardno:"+s.getAtmCardNo());
		System.out.println();
		*/
		
         
	}

}
