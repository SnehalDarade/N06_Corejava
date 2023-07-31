package org.tnsif.Instanceofdemo;
class RBI
{
	 protected String ifscCode="RBIS0NGPA01";
}
class SBI extends RBI
{
	    public SBI() {
		super.ifscCode="RBIS0NGPA02";
		String ifscCode="RBIS0NGPA05";
		System.out.println(ifscCode);
		/* if parent class and child class variable name are same,in such case ,use super ,variable name*/
		System.out.println(super.ifscCode);
	}
	 
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
		
	}

}
