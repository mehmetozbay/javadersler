package ders24_ornek_1;

public class Kitap {

	String kitapAdi;
	int sayfaSayisi;
	public Kitap() {
		// TODO Auto-generated constructor stub
	}
	public Kitap(String kitapAdi, int sayfaSayisi) {
		
		this.kitapAdi = kitapAdi;
		this.sayfaSayisi = sayfaSayisi;
	}
	
	@Override
	public String toString() {
		return "Kitap [kitapAdi=" + kitapAdi + ", sayfaSayisi=" + sayfaSayisi + "]";
	}
}
