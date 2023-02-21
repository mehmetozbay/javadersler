package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			Kullanıcıdan bir harf girmesini isteyiniz Kullanıcının harf mi 
//		yoksa başka bir karakter mi girdiğini kontrol ediniz. 
//		Eğer harf girmişse sesli bir harf mi yoksa sessiz bir harf mi olduğunu yazdırınız 
//		Not: Kullanıcı büyük yada küçük harf girebilir

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		char harf = scan.next().charAt(0);

		if (harf >= 'a' && harf <= 'z' || harf >= 'A' && harf <= 'Z') {
			if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u' || harf == 'A' || harf == 'E'
					|| harf == 'I' || harf == 'O' || harf == 'U') {
				System.out.println("sesli bir harf girdiniz");
			} else {
				System.out.println("sessiz bir harf girdiniz");
			}
		} else {
			System.out.println("lutfen bir harf giriniz");
		}

	}

}
