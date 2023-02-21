package ders24_ornek_1;

public class MainKutuphane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kitap kitap=new Kitap("Sefiller",350);
		System.out.println(kitap.toString());
		Okur okur=new Okur("Sena",17);
		Odunc odunc=new Odunc(kitap, okur, "25.10.2022");
		String sonuc=odunc.toString();
		System.out.println(sonuc);
	}

}
