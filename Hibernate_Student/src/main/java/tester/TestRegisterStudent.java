package tester;
import org.hibernate.SessionFactory;
import static utils.HibernateUtils.getFactory;
import java.time.LocalDate;
import java.util.Scanner;
import dao.StudentDaoImpl;
import pojos.Course;
import pojos.Student;
public class TestRegisterStudent {

	public static void main(String [] args) {
		
		try(SessionFactory sf=getFactory();
				Scanner sc=new Scanner(System.in))
		{
			StudentDaoImpl studDao=new StudentDaoImpl();
			System.out.println("Enter the student details : fname lname email password  course dob ");
			Student stud=new Student(sc.next(),sc.next(),sc.next(),sc.next(),
					Course.valueOf(sc.next().toUpperCase()),LocalDate.parse(sc.next()));
			System.out.println(studDao.registerStudentDetails(stud));
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
