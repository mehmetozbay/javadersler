package test;

public class Araba {

	
	 int fiyat;
     String vitesTipi;
     String renk;
     int kapiSayisi;
     
     public Araba() {
		// TODO Auto-generated constructor stub
	}
     
	public Araba(String renk) {
		this.renk = renk;
	}

	public Araba(int fiyat, String vitesTipi, String renk, int kapiSayisi) {
	
		this.fiyat = fiyat;
		this.vitesTipi = vitesTipi;
		this.renk = renk;
		this.kapiSayisi = kapiSayisi;
	}
     

}
