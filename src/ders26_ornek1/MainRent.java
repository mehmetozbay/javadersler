package ders26_ornek1;

public class MainRent {

	
	public static void main(String[] args) {
		
		
		Arac araba=new Arac();
		araba.setAracMarka("BMW");
		araba.setVitesTuru("Manuel");
		System.out.println(araba.toString());
		Musteri musteri=new Musteri();
		musteri.setMusteriAdi("Ali");
		musteri.setMusteriYas(18);
		System.out.println(musteri.toString());
		Rent rent=new Rent();
		rent.setArac(araba);
		rent.setMusteri(musteri);
		rent.setGunSayisi(10);
		System.out.println(rent.toString());
		
		
		
	}
	
}
