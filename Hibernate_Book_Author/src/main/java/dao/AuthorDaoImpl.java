package dao;

import static utils.HibernateUtils.getFactory;

import org.hibernate.*;

import pojos.Author;

public class AuthorDaoImpl implements AuthorDao{

	@Override
     public String addNewAuthor(Author author) {
    	 String mesg="adding author is failed !!!! ";
    	 
    	 Session session =getFactory().getCurrentSession();
    	 Transaction tx=session.beginTransaction();
    	 
    	 try {
    		 session.persist(author);
    		 tx.commit();
    		 mesg="added new author ";
    		
     }
     catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
     }
}
