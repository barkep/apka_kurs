package data;

import utils.DataReader;

public class Library {

	private final int MAX_VALUE = 1000;
	private Book[] books;
	private int bookNumber;

	public Library() {
		books = new Book[MAX_VALUE];
	}

	public Book[] getBooks() {
		return books;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void addBook() {
		DataReader dataReader = new DataReader();
		Book book = dataReader.ReadAndCreateBook();
		if (bookNumber < MAX_VALUE) {
			books[bookNumber] = book;
			bookNumber++;
		} else {
			System.out.println("Biblioteka pe�na");
		}
	}

	public void print() {
		if (bookNumber == 0) {
			System.out.println("Brak ksi��ek w bibliotece");
		} else {
			System.out.println("Ksi��ki w bibliotece: ");
			for (int i = 0; i < bookNumber; i++) {
				books[i].printInfo();
			}
		}
	}
}
