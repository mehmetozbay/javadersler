package ders24_ornek_3;

public class MainKayit {

	
//	1) Kurs isminde bir class olusturunuz (Kurs Adi, Kontenjan, kayit Sayisi)
//	2) Ogrenci adinda bir class daha olusturunuz(Adi, Yasi)
//	3) KayitIslemleri diye bir Class daha olusturunuz Burada kayit olanlari yazdiriniz
//	4) MainKayit adinda bir Class olsun Burada Ogrenci, Kurs, Kayit islemleri yapilsin
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kurs kurs1=new Kurs("Gitar",30);
		Ogrenci ogr1=new Ogrenci("Ali", 16);
		KayitIslemleri kayit1=new KayitIslemleri(kurs1,ogr1,"22.10.22");
		System.out.println(kayit1.toString());
		Ogrenci.okulIsmi="GOP";
		
		
		System.out.println("Okuladi" +ogr1.okulIsmi);
		
		
		Kurs kurs2=new Kurs("Elisi",30);
		Ogrenci ogr2=new Ogrenci("Sena", 16);
		KayitIslemleri kayit2=new KayitIslemleri(kurs2,ogr2,"22.10.22");
		System.out.println(kayit2.toString());
		
		
		System.out.println("Okuladi" +ogr2.okulIsmi);
		
		
		Ogrenci.okulIsmi="Ataturk";
		
		System.out.println("Yeni Okuladi" +ogr2.okulIsmi);

	}
}
