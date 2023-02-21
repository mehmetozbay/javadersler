package ders29_ornek1;

public class Memur extends Personel {

	public Memur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Memur(String ad, int saatUcreti, int calismaSaati) {
		super(ad, saatUcreti, calismaSaati);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int maasHesapla() {
		return super.maasHesapla()+getSaatUcreti()*getCalismaSaati();
	}

}
