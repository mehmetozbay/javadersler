
public class Calisan extends Person{

	private String calismaSaati;
	
	private String saatUcreti;
	
	public Calisan() {
		// TODO Auto-generated constructor stub
	}

	public Calisan(String ad, int yas, String calismaSaati, String saatUcreti) {
		super(ad, yas);
		this.calismaSaati = calismaSaati;
		this.saatUcreti = saatUcreti;
	}

	public String getCalismaSaati() {
		return calismaSaati;
	}

	public void setCalismaSaati(String calismaSaati) {
		this.calismaSaati = calismaSaati;
	}

	public String getSaatUcreti() {
		return saatUcreti;
	}

	public void setSaatUcreti(String saatUcreti) {
		this.saatUcreti = saatUcreti;
	}
	
}
