
public class Author
{
	private String firstName;
	private String lastName;
	private int birthYear;
	private int publications;
	
	//default constructor
	public Author(){
		this.firstName = " ";
		this.lastName = " ";
		this.birthYear = 0;
		this.publications = 0;
	}
	
	//copy constructor
	public Author(Author newAuthor){
		this.firstName = newAuthor.getFirstName();
		this.lastName = newAuthor.getLastName();
		this.birthYear = newAuthor.getBirthYear();
		this.publications = newAuthor.getPublications();
	}
		
	public void setFirstName(String newFirstName){
		this.firstName = newFirstName;
	}
	
	public void setLastName(String newLastName){
		this.lastName = newLastName;
	}
	
	public void setBirthYear(int newBirthYear){
		this.birthYear = newBirthYear;
	}
	
	public void setPublications(int newPublications){
		this.publications = newPublications;
	}
		
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public int getBirthYear(){
		return this.birthYear;
	}
	
	public int getPublications(){
		return this.publications;
	}
	
	@Override
	public String toString() {
		return "Written by " + firstName + " " + lastName + 
				", who was born in " + Integer.toString(birthYear) + " and has " + Integer.toString(publications) + " publications";
	}
}
