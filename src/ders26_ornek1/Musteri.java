package ders26_ornek1;

public class Musteri {
	
	private String musteriAdi;
	private int musteriYas;
	
	public Musteri() {
		// TODO Auto-generated constructor stub
	}

	public Musteri(String musteriAdi, int musteriYas) {
		super();
		this.musteriAdi = musteriAdi;
		this.musteriYas = musteriYas;
	}

	public String getMusteriAdi() {
		return musteriAdi;
	}

	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}

	public int getMusteriYas() {
		return musteriYas;
	}

	public void setMusteriYas(int musteriYas) {
		this.musteriYas = musteriYas;
	}

	@Override
	public String toString() {
		return "Musteri [musteriAdi=" + musteriAdi + ", musteriYas=" + musteriYas + "]";
	}
}
