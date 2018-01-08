package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.Book;
import data.Magazine;

public class DataReader {

	private Scanner scanner;

	public DataReader() {
		scanner = new Scanner(System.in);
	}

	public void close() {
		scanner.close();
	}

	public Book readAndCreateBook() {
		System.out.print("Podaj tytul ksiazki: ");
		String tytul = scanner.nextLine();
		System.out.print("Podaj autora ksiazki: ");
		String autor = scanner.nextLine();
		System.out.print("Podaj wydawnictwo ksiazki: ");
		String wydawnictwo = scanner.nextLine();
		System.out.print("Podaj numer isbn ksiazki: ");
		String isbn = scanner.nextLine();
		System.out.print("Podaj rok wydania ksiazki: ");
		int rokWydania=0;
		int iloscStron = 0;
		try {
			rokWydania = scanner.nextInt();
			System.out.print("Podaj losc stron ksiazki: ");
			iloscStron = scanner.nextInt();
		} catch (InputMismatchException e) {
			throw e;
		}
		return new Book(tytul, autor, rokWydania, iloscStron, wydawnictwo, isbn);
	}

	public Magazine readAndCreateMagazine() {
		System.out.print("Podaj tytul magazynu: ");
		String tytul = scanner.nextLine();
		System.out.print("Podaj wydawnictwo ksiazki: ");
		String wydawnictwo = scanner.nextLine();
		System.out.print("Podaj jezyka w jakim je wydano: ");
		String language = scanner.nextLine();
		System.out.print("Podaj rok wydania magazynu: ");
		int rokWydania = 0;
		int day = 0;
		int month =0;
		try {
			rokWydania = scanner.nextInt();
			System.out.print("Podaj miesiac wydania: ");
			month = scanner.nextInt();
			System.out.print("Podaj dzien wydania: ");
			day = scanner.nextInt();
		} catch (InputMismatchException e) {
			throw e;
		}
		return new Magazine(tytul, rokWydania, wydawnictwo, day, month, language);
	}
	public int getInt() throws NumberFormatException {
		int number = 0;
		try {
			number = scanner.nextInt();
		} catch (InputMismatchException e) {
			throw new NumberFormatException("Liczba wprowadzona w niepoprawnej formie");
		} finally {
			scanner.nextLine();
		}
		return number;
	}

}
