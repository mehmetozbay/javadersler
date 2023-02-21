package ders24_ornek_1;

public class Odunc {

	Kitap kitap;
	Okur okur;
	String teslimZamani;
	public Odunc() {
		// TODO Auto-generated constructor stub
	}
	public Odunc(Kitap kitap, Okur okur, String teslimZamani) {
		this.kitap = kitap;
		this.okur = okur;
		this.teslimZamani = teslimZamani;
	}
	@Override
	public String toString() {
		return "Odunc [kitap=" + kitap.kitapAdi + ", okur=" + okur.okurAdi + ", teslimZamani=" + teslimZamani + "]";
	}
}
