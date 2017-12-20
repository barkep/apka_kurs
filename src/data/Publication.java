package data;

public class Publication {

	private String tytul;
	private int rokWydania;
	private String wydawnictwo;
	
	Publication(String tytu³, int rokWydania, String wydawnictwo) {
		setTytul(tytu³);
		setRokWydania(rokWydania);
		setWydawnictwo(wydawnictwo);
	}
	
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public int getRokWydania() {
		return rokWydania;
	}
	public void setRokWydania(int rokWydania) {
		this.rokWydania = rokWydania;
	}
	public String getWydawnictwo() {
		return wydawnictwo;
	}
	public void setWydawnictwo(String wydawnictwo) {
		this.wydawnictwo = wydawnictwo;
	}
}
