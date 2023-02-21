package ders29_ornek1;

public class GenelMudur extends Personel {

	public GenelMudur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenelMudur(String ad, int saatUcreti, int calismaSaati) {
		super(ad, saatUcreti, calismaSaati);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int maasHesapla() {
		// TODO Auto-generated method stub
		return super.maasHesapla()+getSaatUcreti()*getCalismaSaati()+1000;
	}
}
