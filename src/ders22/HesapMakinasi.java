package ders22;

public class HesapMakinasi {

	 int sayi1;
	 int sayi2;
	 
	public HesapMakinasi() {
		
	}
	public HesapMakinasi(int sayi1, int sayi2) {
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
	}
	public void topla() {
		System.out.println("sayilarin toplami "+(sayi1+sayi2));
	}
	public void cikar() {
		System.out.println("sayilarin farki "+(sayi1-sayi2));
	}
	public void carp() {
		System.out.println("sayilarin carpimi "+(sayi1*sayi2));
	}
	public void bol() {
		System.out.println("sayilarin bolumu "+(sayi1/sayi2));
	}
}
