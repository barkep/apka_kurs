package apka_kurs;

import data.Library;
import utils.DataReader;
import utils.LibraryUtils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class LibraryControl {

    private DataReader dataReader;
    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    void controlLoop() {
        Option option = null;
        while (option != Option.EXIT) {
            try {
                printOptions();
                option = Option.createFromInt(dataReader.getInt());
                switch (option) {
                    case ADD_BOOK:
                        addBook();
                        break;
                    case PRINT_BOOKS:
                        printBooks();
                        break;
                    case ADD_MAGAZINE:
                        addMagazine();
                        break;
                    case PRINT_MAGAZINES:
                        printMagazines();
                        break;
                    case EXIT:
                        System.out.println("Koniec programu");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Wybrana opcja nie istnieje, wybierz ponownie");
            }
        }
        dataReader.close();
    }

    private void printMagazines() {
        LibraryUtils.printMagazines(library);
    }

    private void addMagazine() {
        library.addMagazine();
    }

    private void printBooks() {
        LibraryUtils.printBooks(library);
    }

    private void addBook() {
        library.addBook();
    }

    private void printOptions() {
        System.out.println("Wybierz opcje: ");
        for (Option o : Option.values()) {
            System.out.println(o);
        }
    }
}


