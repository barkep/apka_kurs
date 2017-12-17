package utils;

import java.util.Scanner;

import data.Book;

public class DataReader {

	private Scanner scanner;

	public DataReader() {
		scanner = new Scanner(System.in);
	}

	public void close() {
		scanner.close();
	}

	public Book ReadAndCreateBook() {
		System.out.print("Podaj tytu³ ksi¹¿ki: ");
		String tytul = scanner.nextLine();
		System.out.print("Podaj autora ksi¹zki: ");
		String autor = scanner.nextLine();
		System.out.print("Podaj rok wydania ksi¹¿ki: ");
		int rokWydania = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Podaj iloœæ stron ksi¹¿ki: ");
		int iloscStron = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Podaj wydawnictwo ksi¹¿ki: ");
		String wydawnictwo = scanner.nextLine();
		System.out.print("Podaj numer isbn ksi¹¿ki: ");
		String isbn = scanner.nextLine();
		return new Book(tytul, autor, rokWydania, iloscStron, wydawnictwo, isbn);
	}

}
