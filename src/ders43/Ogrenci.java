package ders43;

public class Ogrenci {

	private String adi;
	private int yas;
	private String sinif;
	private int notOrtalamasi;

	

	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}

	public Ogrenci(String adi, int yas, String sinif, int notOrtalamasi) {
		super();
		this.adi = adi;
		this.yas = yas;
		this.sinif = sinif;
		this.notOrtalamasi = notOrtalamasi;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

	public int getNotOrtalamasi() {
		return notOrtalamasi;
	}

	public void setNotOrtalamasi(int notOrtalamasi) {
		this.notOrtalamasi = notOrtalamasi;
	}

	@Override
	public String toString() {
		return "Ogrenciler [adi=" + adi + ", yas=" + yas + ", sinif=" + sinif + ", notOrtalamasi=" + notOrtalamasi
				+ "]";
	}

}
