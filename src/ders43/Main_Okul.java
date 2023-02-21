package ders43;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Okul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ogrenci ogr1=new Ogrenci("Ahmet", 15, "9/B",89);
		
		Ogrenci ogr2=new Ogrenci("Ali Kagan",17,"11/C", 85);
		
		Ogrenci ogr3=new Ogrenci("Asya", 18,"BUA", 95);
		
		List<Ogrenci> ogrenciler=Arrays.asList(ogr1, ogr2, ogr3);
//		yasi 15 ten buyuk olanlari yazdir
		
		ogrenciler.stream().filter(t->t.getYas()>15).forEach(t->System.out.println(t.getAdi()));
		
//		Not ortalamasi hepsinin 70 den buyuk mu diye control et
		
		 boolean notOrtalamasiKontrol=ogrenciler.stream().allMatch(t->t.getNotOrtalamasi()>70);
		
		System.out.println("Not ortalamasi kontrol>70 "+notOrtalamasiKontrol);
//		Iclerinde enaz birinin adi Ali mi diye control et
		
		boolean isimKontrol=ogrenciler.stream().anyMatch(t->t.getAdi().contains("Ali"));
		System.out.println("Isim Kontrol "+isimKontrol);
		
//		Yasina gore siralayip en buyuk olani bul
		System.out.println("Yasa gore siralama");
		ogrenciler.stream().sorted(Comparator.comparing(Ogrenci::getYas)).forEach(t->System.out.println(t.getAdi()));
//		Not ortlamasina gore en yuksek ve en dusuk olani bul
		System.out.println("En dusuk notlu olan");
		ogrenciler.stream().sorted(Comparator.comparing(Ogrenci::getNotOrtalamasi)).limit(1)
		.forEach(t->System.out.println(t.getAdi()));
		System.out.println("En yuksek notlu olan");
		ogrenciler.stream().sorted(Comparator.comparing(Ogrenci::getNotOrtalamasi).reversed()).limit(1)
		.forEach(t->System.out.println(t.getAdi()));
		
//		Not ortalamasina gore ilk 3 siradaki orgrencileri list olarak sirala
		System.out.println("Not ortalama ilk  3");
		System.out.println(ogrenciler.stream().sorted(Comparator.comparing(Ogrenci::getNotOrtalamasi).reversed()).limit(3)
				.collect(Collectors.toList()));
//		>Not ortalaması ılk 2nin disında olanları sırala
		System.out.println("Not ortalama ilk  2 disinda olan");
		System.out.println(ogrenciler.stream().sorted(Comparator.comparing(Ogrenci::getNotOrtalamasi).reversed()).skip(2)
				.collect(Collectors.toList()));
	}

}
