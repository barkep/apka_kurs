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
            System.out.println("Biblioteka jest pelna");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < publicationsNumber; i++) {
            builder.append(publications[i]);
            builder.append("\n");
        }
        return builder.toString();
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
