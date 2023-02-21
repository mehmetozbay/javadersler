package ders23;

public class Siparis {

	Arac arac;
	Musteri musteri;
	String satisZamani;

	public Siparis() {
		// TODO Auto-generated constructor stub
	}

	public Siparis(Arac arac, Musteri musteri, String satisZamani) {
		this.arac = arac;
		this.musteri = musteri;
		this.satisZamani = satisZamani;
	}

	public void yazdir() {
		// TODO Auto-generated method stub
		System.out.println(arac.renk + " " + arac.marka + "  aracinizi " + musteri.yas + " yasindaki " + musteri.adi
				+ " adli Musteriye " + satisZamani + " tarihinde sattiniz");
	}
}
