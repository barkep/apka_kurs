package apka_kurs;

public class LibraryApp {
	
	final static String APP_NAME = "Biblioteka v0.8";

	public static void main(String[] args) {

		System.out.println(APP_NAME);

		LibraryControl app = new LibraryControl();
		app.controlLoop();

	}

}