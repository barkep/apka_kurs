package data;

public class Book extends Publication {

	private String autor;
	private int iloscStron;
	private String isbn;

	public Book(String tytul, String autor, int rokWydania, int iloscStron, String wydawnictwo, String isbn) {
		super(tytul, rokWydania, wydawnictwo);
		this.autor = autor;		
		this.iloscStron = iloscStron;
		this.isbn = isbn;
	}

	// gettery i settery

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIloscStron() {
		return iloscStron;
	}

	public void setIloscStron(int iloscStron) {
		this.iloscStron = iloscStron;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void printInfo() {
		System.out.println(
				getTytul() + "; " + getAutor() + "; " + getRokWydania() + "; " + getIloscStron() + "; " + getWydawnictwo() + "; " + getIsbn());
	}

}
