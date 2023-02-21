package ders6;

import java.util.Scanner;

public class Ders6_Ornek8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bilgisayara 0 ile 10 arasinda rastgele rakam urettiriniz.
//		Sonra kullanicidan bir
//		rakam isteyiniz Eger fark 0 ise mukemmel bildiniz, 
//		fark 2 den kucuk ise iyisiniz
//		Fark 5 ten kucuk ise orta, fark 5  ten buyuk ise cok kotusunuz

//		bilgisayar 3 kullanici 8 cok kotusunuz
//		[0,10)
		Scanner scan = new Scanner(System.in);
		int rastgeleSayi = (int) (Math.random() * 11);
		System.out.println(rastgeleSayi);
		System.out.println("Lutfen  0 -10 arasinda  bir sayi giriniz");
		int girilenSayi = scan.nextInt();
		int fark = Math.abs(girilenSayi - rastgeleSayi);
//Mutlak deger |-2|=2  
		if (fark == 0) {
			System.out.println("mukemmel bildiniz");
		}else if(fark<=2) {
			System.out.println("iyisiniz");
		}else if(fark<=5) {
			System.out.println("orta");
		}else {
			System.out.println("kotusunuz");
		}

	}

}
