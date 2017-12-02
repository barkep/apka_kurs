package apka_kurs;

public class Library {
	
	public static void main(String [] args) {
		
		final String appName = "Biblioteka v0.2";
		
		Book book1=new Book();
		
		book1.tytul="W pustyni i w puszczy";
		book1.autor="Henryk Sienkiewicz:";
		book1.rokWydania=2010;
		book1.iloscStron=296;
		book1.wydawnictwo="Greg";
		book1.isbn="9788373271890";
		
		System.out.println(appName);
        System.out.println("Ksi¹¿ki dostêpne w bibliotece:");
        System.out.println(book1.tytul);
        System.out.println(book1.autor);
        System.out.println(book1.rokWydania);
        System.out.println(book1.iloscStron);
        System.out.println(book1.wydawnictwo);
        System.out.println(book1.isbn);
	}

}
