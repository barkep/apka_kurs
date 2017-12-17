package data;

public class Book {

	private String tytul;
	private String autor;
	private int rokWydania;
	private int iloscStron;
	private String wydawnictwo;
	private String isbn;

	public Book(String tytul, String autor, int rokWydania, int iloscStron, String wydawnictwo, String isbn) {
		this.tytul = tytul;
		this.autor = autor;
		this.rokWydania = rokWydania;
		this.iloscStron = iloscStron;
		this.wydawnictwo = wydawnictwo;
		this.isbn = isbn;
	}

	public Book(Book book) {
		this(book.tytul, book.autor, book.rokWydania, book.iloscStron, book.wydawnictwo, book.isbn);
	}

	// gettery i settery

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getRokWydania() {
		return rokWydania;
	}

	public void setRokWydania(int rokWydania) {
		this.rokWydania = rokWydania;
	}

	public int getIloscStron() {
		return iloscStron;
	}

	public void setIloscStron(int iloscStron) {
		this.iloscStron = iloscStron;
	}

	public String getWydawnictwo() {
		return wydawnictwo;
	}

	public void setWydawnictwo(String wydawnictwo) {
		this.wydawnictwo = wydawnictwo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void printInfo() {
		System.out.println(
				tytul + "; " + autor + "; " + rokWydania + "; " + iloscStron + "; " + wydawnictwo + "; " + isbn);
	}

}
