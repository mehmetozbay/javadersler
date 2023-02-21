package ders28_Ornek1;

public class Cocuk extends Baba  {
	public Cocuk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cocuk(String adi, int yas) {
		super(adi, yas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sporYap() {
		// TODO Auto-generated method stub
		super.sporYap();
		System.out.println("Voleybol oynar");
	}
	
}
