package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Course;
public class TestStudentByCourse {

	public TestStudentByCourse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(SessionFactory sf=getFactory(); 
		Scanner sc=new Scanner(System.in))
		{
			StudentDaoImpl dao=new 	StudentDaoImpl();
			
			System.out.println("enter the course ");
			
			dao.getStudentByCourse(Course.valueOf(sc.next().toUpperCase()));
			System.out.println(dao);
			System.out.println(" list of selected course student ");
             			
		}
	}

}
