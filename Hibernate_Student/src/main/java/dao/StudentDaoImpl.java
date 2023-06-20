package dao;

import pojos.Student;
import pojos.Course;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.*;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String registerStudentDetails(Student stud ) {
		String mesg=" Student registration is failed ";
		Session session=getFactory().getCurrentSession();
		Transaction tx= session.beginTransaction();
		try{
			session.save(stud);
			tx.commit();
			mesg=" Student registered successfully";
			
		}
		catch(RuntimeException e) {
			if
			(tx != null)
				tx.rollback();
			throw e;
			
		}
		return null;
		
	}
	
	@Override 
	public Student studentLogin(String email1, String pwd) {
	  Student  studs = null;
	//String 	mesg="Student Login Is Failed ";
	String jpql ="select s from Student s where s.email=:em and s.password=:pass" ;
	Session session =getFactory().getCurrentSession();
	Transaction tx= session.beginTransaction();
	try {
		 session.createQuery(jpql, Student.class)
				.setParameter("em", email1)
				.setParameter("pass", pwd)
				.getSingleResult();
		tx.commit();
	
	 }
	 catch(RuntimeException e)
	 {
		if(tx != null)
			tx.rollback();
	  throw e;
		
	 }
	return studs;
	}
	
	public List<Student> getStudentByCourse(Course course){
		List<Student> studList=null;
		String jpql="select s from  Student s where s.enrolledcourse=:cur";
		
		Session session=getFactory().getCurrentSession();
		
		Transaction tx=session.beginTransaction();
		
		try {
		 session.createQuery(jpql,Student.class)
					.setParameter("cur", course)
					.getResultList();
			tx.commit();
			
		}
		catch(RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
			
		}
		return studList;
		
				
		
	}
	
		
	

}
