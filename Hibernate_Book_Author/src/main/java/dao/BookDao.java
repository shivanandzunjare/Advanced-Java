 package dao;
import pojos.*;
public interface BookDao {
	
	//add new book with autherid
	String addNewBook(Book book,long authorid );

}
