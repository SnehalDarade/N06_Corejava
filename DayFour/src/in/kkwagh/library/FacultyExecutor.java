//program to demonstrate on acess specifier
//driver class
package in.kkwagh.library;
import in.metbkc.library.Library;

public class FacultyExecutor {

	public static void main(String[] args) {
		Library s=new Library();
		s.libraryName="MET LIBRARY";
		s.displayPublic();
		/*userId and displayPrivate is private so we 
		  can not access to the other class
		  we can acess inside the class 
		 */
		//s.userId=12343;
		//s.displayPrivate();
		
    /*booksname and displayDefault method is default we cant acess
     to the another package only we can acess within same package
     */
		//s.booksName;
		//s.displayDefault();

	}

}
