package apka_kurs;

public class LibraryApp {

	public static void main(String[] args) {

		final String appName = "Biblioteka v0.8";

		System.out.println(appName);

		LibraryControl app = new LibraryControl();
		app.controlLoop();

	}

}
