package org.tnsif.StaticKey;
//program to demonstrate static block
public class StaticBlockExecutor {
    String str="bkc";
    static float salary;
    
    /* static block is used to intialize static variable we cant intialize ANY non static variable inside the 
     * static block */
    static {
    	salary=3456.56f;
    	//str="bkc";
    	
    }
    static void print()
    {
    	System.out.println(salary);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        print();
        
        /* main function is static and hence it calls static block,methods,variable by default*/
	}

}
