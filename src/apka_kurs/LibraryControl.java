package apka_kurs;

import data.Library;
import utils.DataReader;

public class LibraryControl {

	private DataReader dataReader;
	private Library library;

	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();
	}

	void controlLoop() {
		Option option;
		printOptions();
		while ((option=Option.createFromInt(dataReader.getInt()))!=Option.EXIT) {
			switch (option) {
			case ADD_BOOK:
				addBook();
				break;
			case PRINT_BOOKS:
				printBooks();
				break;
			case ADD_MAGAZINE:
				addMagazine();
				break;
			case PRINT_MAGAZINES:
				printMagazines();
				break;
			case EXIT:
				System.out.println("Koniec programu");
				break;	
			}
			printOptions();
		}
		dataReader.close();
	}

	private void printMagazines() {
		library.printMagazines();
	}

	private void addMagazine() {
		library.addMagazine();
	}

	private void printBooks() {
		library.printBooks();
		
	}

	private void addBook() {
        library.addBook();	
	}

	private void printOptions() {
		System.out.println("Wybierz opcjê: ");
		for (Option o: Option.values() ) {
			System.out.println(o);
		}
	}
}
	

