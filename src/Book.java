//LibraryCatalogue
//HackerRank day 11
public class Book {
	
	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedOut;
	int dayCheckedOut = -1;
	
	public Book(String title, int pageCount, int iSBN) {
		super();
		this.title = title;
		this.pageCount = pageCount;
		ISBN = iSBN;
		isCheckedOut = false;
		
	}

	public String getTitle() {
		return title;
	}


	public int getPageCount() {
		return pageCount;
	}


	public int getISBN() {
		return ISBN;
	}

	

	public boolean isCheckedOut() {
		return isCheckedOut;
	}

	public void setCheckedOut(boolean isCheckedOut, int currentDayCheckedOut) {
		this.isCheckedOut = isCheckedOut;
		setDayCheckedOut(currentDayCheckedOut);
		
	}

	public int getDayCheckedOut() {
		return dayCheckedOut;
	}

	private void setDayCheckedOut(int dayCheckedOut) {
		this.dayCheckedOut = dayCheckedOut;
	}
	
	
}
