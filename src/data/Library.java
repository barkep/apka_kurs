package data;

import utils.DataReader;

public class Library {

	public static final int MAX_BOOK = 1000;
	public static final int MAX_MAGAZINE = 1000;
	
	private Book[] books;
	private int bookNumber;
	
	private Magazine[] magazines;
	private int magazineNumber;

	public Library() {
		books = new Book[MAX_BOOK];
		magazines = new  Magazine[MAX_MAGAZINE];
	}


	public void addBook() {
		DataReader dataReader = new DataReader();
		Book book = dataReader.readAndCreateBook();
		if (bookNumber < MAX_BOOK) {
			books[bookNumber] = book;
			bookNumber++;
		} else {
			System.out.println("Biblioteka pe³na");
		}
	}
	
	public void addMagazine() {
		DataReader dataReader = new DataReader();
		Magazine magazine = dataReader.readAndCreateMagazine();
		if (magazineNumber < MAX_MAGAZINE) {
			magazines[magazineNumber]=magazine;
			magazineNumber++;
		} else {
			System.out.println("Biblioteka pe³na");
		}
	}

	public void printBooks() {
		if (bookNumber == 0) {
			System.out.println("Brak ksi¹¿ek w bibliotece");
		} else {
			System.out.println("Ksi¹¿ki w bibliotece: ");
			for (int i = 0; i < bookNumber; i++) {
				books[i].printInfo();
			}
		}
	}

	public void printMagazines() {
		if (magazineNumber == 0) {
			System.out.println("Brak magazynów w bibliotece");
		} else {
			System.out.println("Magazyny w bibliotece: ");
			for (int i = 0; i < magazineNumber; i++) {
				magazines[i].printInfo();
			}
		}
	}

	//gettery
	
	public Book[] getBooks() {
		return books;
	}

	public int getBookNumber() {
		return bookNumber;
	}
	
	public Magazine[] getMagazines() {
		return magazines;
	}

	public int getMagazineNumber() {
		return magazineNumber;
	}
	
}
