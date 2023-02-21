package ders27_ornek3;

public class MainCalisan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memur memur=new Memur("Ahmet", 15, "Ankara", 15);
		System.out.println(memur.id);
		Isci isci=new Isci("Ali", 25, "Istanbul",25);
		System.out.println(isci.id);
		memur.girisYap();
		isci.girisYap();
		memur.maasHesapla();
		isci.maasHesapla();
		memur.kayitAl();
		isci.tamirYap();
	 System.out.println(Person.idUret);
	}

}
