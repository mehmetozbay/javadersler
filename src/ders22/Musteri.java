package ders22;

public class Musteri {

	String musteriAdi;
	String musteriAdresi;
	String musteriTel;
	

	public Musteri() {
		
	}


	public Musteri(String musteriAdi, String musteriAdresi, String musteriTel) {
	
		this.musteriAdi = musteriAdi;
		this.musteriAdresi = musteriAdresi;
		this.musteriTel = musteriTel;
	}
	
	public void musteriYazdir(Musteri m) {
		// TODO Auto-generated method stub
    System.out.println("\nMusteri Adi"+m.musteriAdi+"\nAdres "+m.musteriAdresi+"\ntelno"+m.musteriTel);
	}
	
	
}
