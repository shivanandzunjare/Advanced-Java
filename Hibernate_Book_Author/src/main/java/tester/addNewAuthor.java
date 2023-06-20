package tester;

import java.util.Scanner;
import static utils.HibernateUtils.getFactory;
import org.hibernate.SessionFactory;

import dao.AuthorDao;
import dao.AuthorDaoImpl;
import pojos.Author;

public class addNewAuthor {

	public addNewAuthor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	/id first name ,last name , email(unique) , pwd + ???????
		try(Scanner sc=new Scanner(System.in);
				SessionFactory sf=getFactory()){
			AuthorDao dao=new AuthorDaoImpl();
			System.out.println("enter the author details");
			System.out.println(" firstname lastname email password");
			Author newauthor=new Author(sc.next(),sc.next(),sc.next(),sc.next());
			
		
			System.out.println(dao.addNewAuthor(newauthor));
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
