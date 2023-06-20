package pojos;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book extends BaseEntity {
//	Book : id,title(unique), price + ?????
	
	@Column(name="book_title",length=30, unique= true)
	private String book_title;
	
	@Column(name="price ",length=30)
	private double price;
	
	//author1---> *Book 
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author authorId;
	
	public Book() {
		super();
	}

	public Book( String book_title, double price) {
		super();
		
		this.book_title = book_title;
		this.price = price;
	}

	
	public Author getAuthorId() {
		return getAuthorId();
	}
	public void setAuthorId(Author authorId) {
		this.authorId = authorId;
	}



	@Override
	public String toString() {
		return "Book [book_title=" + book_title + ", price=" + price + "]";
	}


	

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
