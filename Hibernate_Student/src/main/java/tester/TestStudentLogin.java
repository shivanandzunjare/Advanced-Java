package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.internal.build.AllowSysOut;

import dao.StudentDaoImpl;
import pojos.Student; 
public class TestStudentLogin {

	public TestStudentLogin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(SessionFactory sf=getFactory();
				Scanner sc=new Scanner(System.in))
		{
			StudentDaoImpl dao=new StudentDaoImpl();
			System.out.println("enter email and  password");
			dao.studentLogin(sc.next(), sc.next());
			System.out.println(dao);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
