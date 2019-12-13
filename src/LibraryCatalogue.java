import java.util.HashMap;
import java.util.Map;

//HackerRank day 11 (30 days of coding) tutorial
public class LibraryCatalogue {
	
	Map<String, Book> bookCollection = new HashMap<String, Book>();
	int currentDay = 0;
	int lengthOfCheckOutPeriod = 7;
	double initialLateFee = 0.50;
	double feePerLatDay = 1.00;
	
	
	public LibraryCatalogue(Map<String, Book> bookCollection) {
		super();
		this.bookCollection = bookCollection;
	}


	public LibraryCatalogue(Map<String, Book> bookCollection, int lengthOfCheckOutPeriod,
			double initialLateFee, double feePerLatDay) {
		super();
		this.bookCollection = bookCollection;
		this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
		this.initialLateFee = initialLateFee;
		this.feePerLatDay = feePerLatDay;
	}


	public Map<String, Book> getBookCollection() {
		return bookCollection;
	}


	public int getCurrentDay() {
		return currentDay;
	}


	public int getLengthOfCheckOutPeriod() {
		return lengthOfCheckOutPeriod;
	}


	public double getInitialLateFee() {
		return initialLateFee;
	}


	public double getFeePerLatDay() {
		return feePerLatDay;
	}

	public Book getBook(String bookTitle) {
		return getBookCollection().get(bookTitle);
	}
	
	public void nextDay() {
		currentDay++;
	}
	public void setDay(int day) {
		currentDay = day;
	}
	
	
	//Instance methods
	public void checkOut(String title) {
		Book book = getBook(title);
		if(book.isCheckedOut()) {
			sorryBookAlreadyCheckedOut(book);
		}else {
			book.setCheckedOut(true, currentDay);
			System.out.println("You just checked out " + title + ". It is due on day " + (getCurrentDay() + getLengthOfCheckOutPeriod()) + ".");
		}
	}
	public void returnBook(String title) {
		Book book = getBook(title);
		int daysLate = currentDay - (book.getDayCheckedOut()  + getLengthOfCheckOutPeriod());
		if(daysLate > 0) {
			System.out.println("You owe the library $" + (getInitialLateFee() + daysLate * getFeePerLatDay()) +
					" because your book is " + daysLate + " days overdue.");
		}else {
			System.out.println("Book returned. Thank you");
		}
		book.setCheckedOut(false, -1);
	}
	
	public void sorryBookAlreadyCheckedOut(Book book) {
		System.out.println("Sorry, " + book.getTitle()  + " is already checked out. "+
							"It should be back on day " + (book.getDayCheckedOut() + 
									getLengthOfCheckOutPeriod()) + ".");
		
	}
	public static void main(String[] args) {
		
		Map<String, Book> bookCollection = new HashMap<>();
		Book harry = new Book("Harry Potter", 827132, 9999999);
		bookCollection.put("Harry Potter", harry);
		LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
		
		lib.checkOut("Harry Potter");
		lib.nextDay();
		lib.nextDay();
		lib.checkOut("Harry Potter");
		lib.setDay(17);
		lib.returnBook("Harry Potter");
		lib.checkOut("Harry Potter");
	}
	


}
