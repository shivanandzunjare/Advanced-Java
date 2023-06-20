package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.BookDao;
import dao.BookDaoImpl;
import pojos.Book;

public class addNewBookWithAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book : title(unique), price + ?????
		try(SessionFactory sf=getFactory();
				Scanner sc =new Scanner(System.in)){
			BookDao dao=new BookDaoImpl();
			System.out.println(" enter the book details : book_title  price ");

			Book book=new Book(sc.next(),sc.nextDouble());
			System.out.println(" enter the auther id ");
			int authorid=sc.nextInt();
			dao.addNewBook(book,authorid);
			System.out.println(dao);
			
		}
	}

}
