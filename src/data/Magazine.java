package data;

public class Magazine extends Publication {

	private int day;
	private int month;
	private String language;
	
	public Magazine(String tytu³, int rokWydania, String wydawnictwo, int day, int month, String language) {
		super(tytu³, rokWydania, wydawnictwo);
		setDay(day);
		setMonth(month);
		setLanguage(language);
	}

	// gettery i settery
	
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
	
	public void printInfo() {
        String info = getTytul() + "; " + getWydawnictwo() + "; " + getRokWydania() + "-"
                + getMonth() + "-" + getDay() + "; " + getLanguage();
        System.out.println(info);
	}
}
