package data;

public class Publication {

	private String tytul;
	private int rokWydania;
	private String wydawnictwo;

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

	Publication(String tytul, int rokWydania, String wydawnictwo) {
		setTytul(tytul);
		setRokWydania(rokWydania);
		setWydawnictwo(wydawnictwo);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rokWydania;
		result = prime * result + ((tytul == null) ? 0 : tytul.hashCode());
		result = prime * result + ((wydawnictwo == null) ? 0 : wydawnictwo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publication other = (Publication) obj;
		if (rokWydania != other.rokWydania)
			return false;
		if (tytul == null) {
			if (other.tytul != null)
				return false;
		} else if (!tytul.equals(other.tytul))
			return false;
		if (wydawnictwo == null) {
			if (other.wydawnictwo != null)
				return false;
		} else if (!wydawnictwo.equals(other.wydawnictwo))
			return false;
		return true;
	}

}
