
public class Book
{
	private int numberOfPages;
	private int yearPublished;
	private double price; 
	private String title;
	private Author author;
	
	//default constructor
	public Book(){
		this.numberOfPages = 0;
		this.yearPublished = 0;
		this.price = 0.00;
		this.title = " ";
		this.author = new Author();
	}
	
	//copy constructor 
	public Book(Book newBook){
		this.numberOfPages = newBook.getNumberOfPages();
		this.yearPublished = newBook.getYearPublished();
		this.price = newBook.getPrice();
		this.title = newBook.getTitle();		
		// Copy
		this.author = new Author(newBook.author);
		// One at a time
		//this.author.setBirthYear(newBook.author.getBirthYear());	
	}
	
	public void setNumberOfPages(int newNumberOfPages){
		this.numberOfPages = newNumberOfPages;
	}
	
	public void setYearPublished(int newYearPublished){
		this.yearPublished = newYearPublished;
	}
	
	public void setPrice(double newPrice){
		this.price = newPrice;
	}
	
	public void setTitle(String newTitle){
		this.title = newTitle;
	}
	
	public void setAuthor(String firstName, String lastName, int birthYear,
		int numOfPublications) {
		this.author.setFirstName(firstName);
		this.author.setLastName(lastName);
		this.author.setPublications(numOfPublications);
		this.author.setBirthYear(birthYear);
	}
	
	public int getNumberOfPages(){
		return this.numberOfPages;
	}
	
	public int getYearPublished(){
		return this.yearPublished;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	@Override
	public String toString() {
		/*
		return "Title: " + title + '\n' +
				"Published in: " + Integer.toString(yearPublished) + '\n' +
				"Number of Pages: " + Integer.toString(numberOfPages) + '\n' +
				"Price: $" + String +
				author.toString();*/
		
		return String.format("Title: %s\nPublished in: %s\nNumber of Pages: %d\nPrice: $%.2f\n%s",
			title, yearPublished, numberOfPages, price, author.toString());
		
		
		
	}

}
