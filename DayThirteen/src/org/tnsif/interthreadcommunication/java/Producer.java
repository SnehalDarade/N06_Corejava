package org.tnsif.interthreadcommunication.java;

//Program to demonstrate InterThread Communication - Producer Thread Class

public class Producer extends Thread{
	Q obj;

	public Producer(Q obj) {
		
		this.obj = obj;
		start();
	}
	
public void run()
{
	  int i=0;
	  while(true)
	  {
		  try
		  {
			  Thread.sleep(0);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  obj.put(i);
		  i++;
	  }
}
}