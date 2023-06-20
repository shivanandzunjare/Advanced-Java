package dao;
import static utils.HibernateUtils.getFactory;

import org.hibernate.Session;

import pojos.Author;
import pojos.Book;

import org.hibernate.*;

public class BookDaoImpl implements BookDao {

	public String addNewBook(Book book,long authorid) {
		
		String mesg="adding new book is failed  ";
		Session session =getFactory().getCurrentSession();
		 
		Transaction tx =session.beginTransaction();
		
		try {
			Author auth =session.get(Author.class, authorid);
			if( auth != null) {
				auth.addBook(book);
			session.persist(book);
			mesg="added new book "+ auth.getFirstName();
			}
			tx.commit();
		
		}
		catch(RuntimeException e) {
		if(tx != null)
			tx.rollback();
		throw e;
			
		}
		return mesg;
	}
}
