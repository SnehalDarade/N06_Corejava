package org.tnsf.SuperDemo;
//program to demonstrate super cunstructor
class Google
{
	String ceo;

	public Google(String ceo) {
		System.out.println("default constuctor:"+ceo);
	}
	
}
class Gmail extends Google
{
	String userid;

	public Gmail(String ceo,String userid) {
		//calling to parent class paramerized
		super(ceo);
		this.userid = userid;
		System.out.println(userid);
	}
	
	
}
public class SuperKeyConstuctor {

	public static void main(String[] args) {
		Gmail s=new Gmail("sundar pichai","abc@gmail.com");
		
	}

}
