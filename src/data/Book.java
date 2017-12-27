package data;

public class Book extends Publication {

	private String autor;
	private int iloscStron;
	private String isbn;

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

	public Book(String tytul, String autor, int rokWydania, int iloscStron, String wydawnictwo, String isbn) {
		super(tytul, rokWydania, wydawnictwo);
		this.autor = autor;
		this.iloscStron = iloscStron;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(getTytul());
		result.append(";");
		result.append(getAutor());
		result.append(";");
		result.append(getRokWydania());
		result.append(";");
		result.append(getIloscStron());
		result.append(";");
		result.append(getWydawnictwo());
		result.append(";");
		result.append(getIsbn());
		result.append(";");
		return result.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + iloscStron;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (iloscStron != other.iloscStron)
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

}
