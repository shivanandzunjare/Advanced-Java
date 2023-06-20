package dao;

import java.time.LocalDate;
import java.util.List;

import pojos.Student;
import pojos.Course;

public interface StudentDao {
//add a method to insert new Stud details
	String registerStudentDetails(Student stud );
	
	Student studentLogin(String email, String password);
	
	List<Student> getStudentByCourse(Course enrolledcourse);
	
	


}
