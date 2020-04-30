
public class lab1
{

	public static void main(String[] args)
	{	
		/*
		Author author = new Author(); //default constructor
		author.setFirstName("Susan");
		author.setLastName("Hinton");
		author.setBirthYear(1948);
		author.setPublications(9);
		System.out.println(author.getFirstName());
		System.out.println(author.getLastName());
		System.out.println(author.getBirthYear());
		System.out.println(author.getPublications());
		Book book = new Book(); //default constructor 
		book.setNumberOfPages(128);
		book.setPrice(6.00);
		book.setTitle("The Outsiders");
		System.out.println(book.getNumberOfPages());
		System.out.println(book.getPrice());
		System.out.println(book.getTitle());
		Author newAuthor = new Author(author); //copy constructor
		System.out.println(newAuthor.getFirstName());
		Book newBook = new Book(book); //copy constructor
		System.out.println(newBook.getNumberOfPages());
	}*/
		
		Book book1 = new Book();
		book1.setTitle("The Outsiders");
		book1.setNumberOfPages(128);
		book1.setPrice(6.00);
		book1.setYearPublished(1995);
		book1.setAuthor("Susan", "Hinton", 1948, 9);
		
		
		Book book2 = new Book(book1);
		book1.setTitle("NEW");
		book1.setAuthor("new", "new", 1, 1);
		System.out.println(book1.toString());
		System.out.println(book2.toString());		
	}
	
}
