package ders27_ornek3;

public class Isci extends Person{

	public Isci() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Isci(String ad, int yas, String adres, int saatUcreti) {
		super(ad, yas, adres, saatUcreti);
		// TODO Auto-generated constructor stub
	}

	public void tamirYap() {
		// TODO Auto-generated method stub
       System.out.println(ad+"Tamir yapar");
	}
}
