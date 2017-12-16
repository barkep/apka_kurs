package apka_kurs;

import data.Book;
import utils.DataReader;

public class Library {

	public static void main(String[] args) {

		final String appName = "Biblioteka v0.7";
		
		Book book[]=new Book[1000];
		DataReader reader=new DataReader();
		book[0]=reader.ReadAndCreateBook();
		book[1] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz:", 2010, 296, "Greg", "9788373271890");
		book[2] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009, 352, "Helion",
				"9788324620845");
		book[3] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
				2008, 851, "McGraw-Hill Osborne Media", "9780071591065");
		reader.close();
		System.out.println(appName);
		System.out.println("Ksi¹¿ki w bibliotece: ");
		book[0].printInfo();
		book[1].printInfo();
		book[2].printInfo();
		book[3].printInfo();
	}

}
