package pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="author")
public class Author extends BaseEntity {
	//id first name ,last name , email(unique) , pwd + ???????
		//	Book : id,title(unique), price + ?????

	
	
	@Column(name = "first_name", length = 20) // varchar(20)
	private String firstName;
	
	@Column(name = "last_name", length = 20)
	private String lastName;
	
	@Column(length = 30, unique = true) // unique constraint
	private String email;
	
	@Column(length = 20, nullable = false) // NOT NULL constraint
	private String password;
	//author1---> *Book 
	@OneToMany(mappedBy = "authorId",cascade = CascadeType.ALL)
	private List<Book> bookList=new ArrayList<>();
	public Author() {
		super();
	}


	public Author( String firstName, String lastName, String email, String password) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
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


	@Override
	public String toString() {
		return "Author [+autherid="+ getId() +",  firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	public void addBook(Book b) {
		bookList.add(b);
		b.setAuthorId(this);
	}
	public void removeBook(Book b) {
		bookList.remove(b);
		b.setAuthorId(null);
	}
}

