package org.tnsif.FinalKeyword;
//program to demonstrate on final method
//parent class
//final class can not be inherit
public class Laptop {
     final String processor="intel 15";
     //final method
     //we cant override final method
     /*final void display()
     {
    	 System.out.println(processor);
     }*/
     final void display()
     {
    	 System.out.println(processor);
     }
     
}
