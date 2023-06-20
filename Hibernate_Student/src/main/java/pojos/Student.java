package pojos;

import java.time.LocalDate;
import javax.persistence.*;//all specs Java EE supplied


@Entity 
		
@Table(name = "students") // to specify table name
public class Student {

	@Id // mandatory , PK constraint
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "stud_id") // col name=emp_id
	private Integer studId;
	
	@Column(name = "first_name", length = 20) // varchar(20)
	private String firstName;
	
	@Column(name = "last_name", length = 20)
	private String lastName;
	
	@Column(length = 30, unique = true) // unique constraint
	private String email;
	
	@Column(length = 20, nullable = false) // NOT NULL constraint
	private String password;
	

	@Enumerated(EnumType.STRING) // => col type : 
	@Column(name = "course", length = 20) 
	private Course enrolledcourse;
	
	@Column( nullable = false)
	private LocalDate dob;

	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public Student( String firstName, String lastName, String email, String password,
			Course enrolledcourse, LocalDate dob) {
		super();
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.enrolledcourse = enrolledcourse;
		this.dob = dob;
	}



	public Integer getStudId() {
		return studId;
	}



	public void setStudId(Integer studId) {
		this.studId = studId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Course getEnrolledcourse() {
		return enrolledcourse;
	}



	public void setEnrolledcourse(Course enrolledcourse) {
		this.enrolledcourse = enrolledcourse;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	@Override
	public String toString() {
		return "Student [studId=" + studId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", enrolledcourse=" + enrolledcourse + ", dob=" + dob + "]";
	}	



}
