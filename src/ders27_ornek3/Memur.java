package ders27_ornek3;

public class Memur  extends Person{
	public Memur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Memur(String ad, int yas, String adres, int saatUcreti) {
		super(ad, yas, adres, saatUcreti);
		// TODO Auto-generated constructor stub
	}
	public void kayitAl() {
		System.out.println(ad+"kayit alir");
	}
}
