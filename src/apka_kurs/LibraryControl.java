package apka_kurs;

import java.util.Scanner;

import data.Library;

public class LibraryControl {

	private Scanner scanner;

	void controlLoop() {
		int menu = -1;
		Library library = new Library();
		while (menu != 0) {
			System.out.println("1. Dodaj ksi¹¿kê");
			System.out.println("2. Wyœwietl ksi¹zkê");
			System.out.println("0. Zakoñcz");
			System.out.print("Wybierz opcje: ");
			scanner = new Scanner(System.in);
			menu = scanner.nextInt();

			switch (menu) {
			case (1):
				library.addBook();
				break;
			case (2):
				library.print();
				break;
			case (0):
				System.out.println("Koniec programu");
				break;
			default:
				System.out.println("Wprowadzono zl¹ opcjê, sprobuj jeszcze raz");
			}
		}

	}

}
