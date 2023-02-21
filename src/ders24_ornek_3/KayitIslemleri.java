package ders24_ornek_3;

public class KayitIslemleri {

	Kurs kurs;
	Ogrenci ogrenci;
	String kayitTarihi;
	static int kayitSayisi=0;
	
	public KayitIslemleri() {
		// TODO Auto-generated constructor stub
		kayitSayisi++;
	}


	public KayitIslemleri(Kurs kurs, Ogrenci ogrenci, String kayitTarihi) {
		this.kurs = kurs;
		this.ogrenci = ogrenci;
		this.kayitTarihi = kayitTarihi;
		kayitSayisi++;
	}


	@Override
	public String toString() {
		return "KayitIslemleri [kurs=" + kurs.kursAdi + ", ogrenci=" + ogrenci.ogrenciAdi + ", kayitTarihi=" + kayitTarihi
				+ ", kayitSayisi=" + kayitSayisi + "]";
	}


}
