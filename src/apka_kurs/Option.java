package apka_kurs;

public enum Option {
	EXIT(0, "Wyjœcie z programu"), 
	ADD_BOOK(1, "Dodaj ksi¹zke"), 
	PRINT_BOOKS(2, "Wyœwietl ksi¹¿ki w bibliotece"), 
	ADD_MAGAZINE(3, "Dodaj magazyn"), 
	PRINT_MAGAZINES(4, "Wyœwietl magazyny w bibliotece");

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
		return Option.values()[option];
	}

}
