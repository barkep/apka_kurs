package utils;

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
		System.out.print("Podaj tytu� ksi��ki: ");
		String tytul = scanner.nextLine();
		System.out.print("Podaj autora ksi�zki: ");
		String autor = scanner.nextLine();
		System.out.print("Podaj rok wydania ksi��ki: ");
		int rokWydania = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Podaj ilo�� stron ksi��ki: ");
		int iloscStron = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Podaj wydawnictwo ksi��ki: ");
		String wydawnictwo = scanner.nextLine();
		System.out.print("Podaj numer isbn ksi��ki: ");
		String isbn = scanner.nextLine();
		return new Book(tytul, autor, rokWydania, iloscStron, wydawnictwo, isbn);
	}

	public Magazine readAndCreateMagazine() {
		System.out.print("Podaj tytu� magazynu: ");
		String tytul = scanner.nextLine();
		System.out.print("Podaj rok wydania magazynu: ");
		int rokWydania = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Podaj dzie� wydania: ");
		int day = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Podaj miesiac wydania: ");
		int month = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Podaj wydawnictwo ksi��ki: ");
		String wydawnictwo = scanner.nextLine();
		System.out.print("Podaj j�zyka w jakim je wydano: ");
		String language = scanner.nextLine();
		return new Magazine(tytul, rokWydania, wydawnictwo, day, month, language);
	}

}
