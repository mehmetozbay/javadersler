package ders26_ornek1;

public class Rent {

	private Musteri musteri;
	private Arac arac;
	private int gunSayisi;
	 
	
	public Rent() {
		// TODO Auto-generated constructor stub
	}
	
	public Rent(Musteri musteri, Arac arac, int gunSayisi) {
		super();
		this.musteri = musteri;
		this.arac = arac;
		this.gunSayisi = gunSayisi;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public Arac getArac() {
		return arac;
	}

	public void setArac(Arac arac) {
		this.arac = arac;
	}

	public int getGunSayisi() {
		return gunSayisi;
	}

	public void setGunSayisi(int gunSayisi) {
		this.gunSayisi = gunSayisi;
	}

	
	private int rentHesapla() {
		
		int rent=gunSayisi*50;
		
		return rent;
	}
	
	@Override
	public String toString() {
		int toplamTutar=rentHesapla();
		return "Rent [musteri=" + musteri.getMusteriAdi() + ", arac=" + arac.getAracMarka() + ",Gun Sayisi=" +gunSayisi+"  Toplam Hesap=" + toplamTutar + "]";
	}
}
