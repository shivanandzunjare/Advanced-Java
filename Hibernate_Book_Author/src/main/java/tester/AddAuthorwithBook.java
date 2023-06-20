package tester;
import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AuthorDao;
import dao.AuthorDaoImpl;
import pojos.Author;
import pojos.Book;

public class AddAuthorwithBook {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
	try(SessionFactory sf=getFactory();
			Scanner sc =new Scanner(System.in)){
		
		AuthorDao dao =new AuthorDaoImpl();
		System.out.println(" enter the author details fname lname email pass ");
		Author newauthor=new Author(sc.next(),sc.next(),sc.next(),sc.next());
		System.out.println(" enter the no book you want to add");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(" enter the book details book_tite price ");
			Book book=new Book(sc.next(),sc.nextInt());
			newauthor.addBook(book);
			
		}
		System.out.println(dao.addNewAuthor(newauthor));
		
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
		
		
	}

}
