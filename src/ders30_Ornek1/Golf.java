package ders30_Ornek1;

public class Golf extends Araba implements DisAksesuar,IcAksesuar  {

	public Golf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Golf(String model, String yakitTuru, String vitesTuru) {
		super(model, yakitTuru, vitesTuru);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yakitTuruBelirle() {
		System.out.println("yakit Turu"+getYakitTuru());
	}

	@Override
	public void vitesTuruBelirle() {
		System.out.println("Vites turu"+getVitesTuru());
		System.out.println(SAYI2);
		System.out.println("ic aksesuar sayi1 " +IcAksesuar.SAYI1);
		System.out.println("Dis aksesuar sayi1 " +DisAksesuar.SAYI1);
	}
	@Override
	public void modelTuruBelirle() {
		System.out.println("Model "+getModel());
	}

	@Override
	public void renkBelirle() {
		// TODO Auto-generated method stub
		System.out.println("Rengi Beyaz");
	}

	@Override
	public void lambaTuruBelirle() {
		// TODO Auto-generated method stub
		System.out.println("LED");
	}

	@Override
	public void koltukKumasTipi() {
		// TODO Auto-generated method stub
		System.out.println("Deri");
	}

	@Override
	public void displayTuru() {
		// TODO Auto-generated method stub
		System.out.println("Pro");
	}

	@Override
	public String kamera() {
		// TODO Auto-generated method stub
		return null;
	}


}
