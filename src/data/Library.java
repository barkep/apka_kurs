package data;

import utils.DataReader;

public class Library {

	public static final int MAX_PUBLICATIONS = 1000;

	private Publication[] publications;
	private int publicationsNumber = 0;

	public Library() {
		publications = new Publication[MAX_PUBLICATIONS];
	}

	public void addBook() {
		DataReader dataReader = new DataReader();
		Book book = dataReader.readAndCreateBook();
		addPublication(book);
	}

	public void addMagazine() {
		DataReader dataReader = new DataReader();
		Magazine magazine = dataReader.readAndCreateMagazine();
		addPublication(magazine);
	}

	private void addPublication(Publication publication) {
		if (publicationsNumber < MAX_PUBLICATIONS) {
			publications[getPublicationsNumber()] = publication;
			setPublicationsNumber(getPublicationsNumber() + 1);
		} else {
			System.out.println("Biblioteka jest pe³na");
		}
	}

	public void printBooks() {
		int countBooks = 0;
		for (int i = 0; i < getPublicationsNumber(); i++) {
			if (publications[i] instanceof Book) {
				System.out.println(publications[i]);
				countBooks++;
			}
		}
		if (countBooks == 0) {
			System.out.println("Brak ksi¹¿ek w bibliotece");
		}
	}

	public void printMagazines() {
		int countMagazines = 0;
		for (int i = 0; i < getPublicationsNumber(); i++) {
			if (publications[i] instanceof Magazine) {
				System.out.println(publications[i]);
				countMagazines++;
			}
		}
		if (countMagazines == 0) {
			System.out.println("Brak magazynów w bibliotece");
		}

	}

	// gettery

	public int getPublicationsNumber() {
		return publicationsNumber;
	}

	public void setPublicationsNumber(int publicationsNumber) {
		this.publicationsNumber = publicationsNumber;
	}

	public Publication[] getPublications() {
		return publications;
	}

	public void setPublications(Publication[] publications) {
		this.publications = publications;
	}

}
