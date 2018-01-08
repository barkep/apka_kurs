package apka_kurs;

import java.util.NoSuchElementException;

public enum Option {
    EXIT(0, "Wyjscie z programu"),
    ADD_BOOK(1, "Dodaj ksiazke"),
    PRINT_BOOKS(2, "Wyswietl ksiazki w bibliotece"),
    ADD_MAGAZINE(3, "Dodaj magazyn"),
    PRINT_MAGAZINES(4, "Wyswietl magazyny w bibliotece");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return value + "-" + description;
    }

    public static Option createFromInt(int option) {
        Option result = null;
        try {
            result = Option.values()[option];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException("Brak elementu o wskazanym ID");
        }
        return result;
    }
}
