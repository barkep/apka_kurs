package apka_kurs;

public class Book {

	String tytul;
	String autor;
	int rokWydania;
	int iloscStron;
	String wydawnictwo;
	String isbn;

	Book(String tytul, String autor, int rokWydania, int iloscStron, String wydawnictwo, String isbn) {
		this.tytul = tytul;
		this.autor = autor;
		this.rokWydania = rokWydania;
		this.iloscStron = iloscStron;
		this.wydawnictwo = wydawnictwo;
		this.isbn = isbn;
	}
	
	Book(Book book) {
		this(book.tytul,book.autor,book.rokWydania,book.iloscStron,book.wydawnictwo,book.isbn);
	}

	void printInfo() {
		System.out.println(
				tytul + "; " + autor + "; " + rokWydania + "; " + iloscStron + "; " + wydawnictwo + "; " + isbn);
	}
}
