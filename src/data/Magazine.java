package data;

public class Magazine extends Publication {

	private int day;
	private int month;
	private String language;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Magazine(String tytuł, int rokWydania, String wydawnictwo, int day, int month, String language) {
		super(tytuł, rokWydania, wydawnictwo);
		setDay(day);
		setMonth(month);
		setLanguage(language);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(getTytul());
		result.append(";");
		result.append(getWydawnictwo());
		result.append(";");
		result.append(getRokWydania());
		result.append("-");
		result.append(getMonth());
		result.append("-");
		result.append(getDay());
		result.append(";");
		result.append(getLanguage());
		result.append(";");
		return result.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + day;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + month;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazine other = (Magazine) obj;
		if (day != other.day)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (month != other.month)
			return false;
		return true;
	}

}
