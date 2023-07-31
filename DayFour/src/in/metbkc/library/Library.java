//program to demonstrate on acess specifier
package in.metbkc.library;
public class Library {
    //differt acess specifier 
	public String libraryName;
     private long userId;
     String booksName;
     
     public void displayPublic() 
     {
    	 System.out.println("Library Name:"+libraryName);
     }
     private void displayPrivate()
     {
    	 System.out.println("userId"+userId);
     }
     void diplayDefault()
     {
    	 System.out.println("BooksName:"+booksName);
     }
}
