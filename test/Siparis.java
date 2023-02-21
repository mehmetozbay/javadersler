package test;

public class Siparis {

	
	Urun urun;
	Musteri musteri;
	int adet;
	
	public Siparis() {
		// TODO Auto-generated constructor stub
	}

	public Siparis(Urun urun, Musteri musteri, int adet) {
		super();
		this.urun = urun;
		this.musteri = musteri;
		this.adet = adet;
	}
	
	
	protected void faturaYaz() {
	
		System.out.println("Merhaba "+musteri.adi+" siparisiniz alinmistir "
				+ "Urun adi "+urun.adi+"urun boyutu"
				+"Siparis adedi"+adet+"Toplam fiyat"+adet*urun.fiyat);

	}
}
