package ders22;

public class SatisSistemi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Urun urun=new Urun("Elbise","Kirmizi","S",15);
		Kisi musteri=new Kisi("Sena", "Istanbul");
	    Siparis siparis=new Siparis(musteri, urun, 12);
	    siparis.faturaYaz();
		
	}

}
