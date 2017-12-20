package apka_kurs;

import java.util.Scanner;

import data.Library;

public class LibraryControl {

	private Scanner scanner;
	private final int EXIT = 0;
	private final int ADD_BOOK = 1;
	private final int PRINT_BOOKS = 2;
	private final int ADD_MAGAZINE = 3;
	private final int PRINT_MAGAZINES = 4;

	void controlLoop() {
		int menu = -1;
		Library library = new Library();
		while (menu != EXIT) {
			System.out.println(ADD_BOOK + ". Dodaj ksi¹¿kê");
			System.out.println(PRINT_BOOKS + ". Wyœwietl ksi¹¿ki");
			System.out.println(ADD_MAGAZINE + ". Dodaj magazyn");
			System.out.println(PRINT_MAGAZINES + ". Wyœwietl magazyny");
			System.out.println(EXIT + ". Zakoñcz");
			System.out.print("Wybierz opcje: ");
			scanner = new Scanner(System.in);
			menu = scanner.nextInt();

			switch (menu) {
			case (ADD_BOOK):
				library.addBook();
				break;
			case (PRINT_BOOKS):
				library.printBooks();
				break;
			case (ADD_MAGAZINE):
				library.addMagazine();
				break;
			case (PRINT_MAGAZINES):
				library.printMagazines();
				break;
			case (EXIT):
				System.out.println("Koniec programu");
				break;
			default:
				System.out.println("Wprowadzono zl¹ opcjê, sprobuj jeszcze raz");
			}
		}

	}

}
