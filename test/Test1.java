package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

//	 int x=10, y=20;
//	 String sonuc= x>y?"x>y":"y>x";
//	 System.out.println(sonuc);

//	 int x=10;
//	 int y=12;
//	 int a=(x<5)?(y>5?x++:2*x):(y>5?x++:2*x+y);
//	 int b=(y<5)?(++y):(x==10?++x:y++);
//	 System.out.println(x+" "+y+" "+a+" "+b);

//	 int x=5;
//	 
//	System.out.println( x>3?(x<10?2*x:2+x):(x++));

		Scanner scan = new Scanner(System.in);
//	 System.out.println("Rezervasyon icin 1,  Bilgi almak icin 2, "
//	 		+ "Dilek ve Sikayet Icin 3 u tiklayiniz ");
//	 int num=scan.nextInt();
//	 switch (num) {
//	case 1:System.out.println("Reservationa Hos geldiniz");
//		break;
//	case 2:System.out.println("Bilgi alma Servisine Hos geldiniz");
//	break;
//	case 3:System.out.println("Dilek ve Sikayetleriniz bizim icin cok onemlidir");
//	break;
//	default:System.out.println("yalnis bir numara cevirdiniz");
//		break;

//	 System.out.println("Bir sayi giriniz");
//	 
//	 char sayi=scan.next().charAt(0);
//	 
//	 System.out.println("bir secenek seciniz");
//	 
//	 int sec=scan.nextInt();
//	 switch (sec) {
//	case 1:  int kare=(int) Math.pow(sayi, 2);
//	System.out.println("sayinin karesi "+kare);
//		break;
//	case 2:  int kup=(int) Math.pow(sayi, 3);
//	System.out.println("sayinin kupu "+kup);
//		break;
//	case 3:  int karekok=(int) Math.sqrt(sayi);
//	System.out.println("sayinin kakekoku "+karekok);
//		break;
//	default:
//		break;
//	}
//	 
//	
//	int rakam=12;
//	 switch (sayi) {
//	case '+': System.out.println("sayi toplami"+(rakam+5));
//		
//		break;
//
//	default:
//		break;
//	}
//	 
//	 String isim1="Java Candir";
//	System.out.println(isim1.contains("a"));
//	System.out.println(isim1.contains("b"));
//	System.out.println(isim1.contains(" "));
//	System.out.println(isim1.contains(""));
//	System.out.println(isim1.contains("Java"));

		System.out.println(" lutfen bir harf giriniz");
		char harf = scan.next().charAt(0);
		if (harf > 'a' && harf < 'z' || harf > 'A' && harf < 'Z') {
			System.out.println("harf girdiniz");
		} else {
			System.out.println("rakam girdiniz");
		}
	}
}
