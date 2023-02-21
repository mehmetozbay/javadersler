package ders29_ornek1;

public class Isci extends Personel {

	public Isci() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Isci(String ad, int saatUcreti, int calismaSaati) {
		super(ad, saatUcreti, calismaSaati);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int maasHesapla() {
		// TODO Auto-generated method stub
		return super.maasHesapla()+getSaatUcreti()*getCalismaSaati();
	}
}
