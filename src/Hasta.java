
public class Hasta extends Person {

	
	private String hastaSikayeti;
	
	public Hasta() {
		// TODO Auto-generated constructor stub
	}

	public Hasta(String ad, int yas, String hastaSikayeti) {
		super(ad, yas);
		this.hastaSikayeti = hastaSikayeti;
	}

	
	public String getHastaSikayeti() {
		return hastaSikayeti;
	}

	public void setHastaSikayeti(String hastaSikayeti) {
		this.hastaSikayeti = hastaSikayeti;
	}
	
	
	
}
