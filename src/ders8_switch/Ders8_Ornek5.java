package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Kullanicidan Mevsimi sorun karsilik gelen aylari yazdiriniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir mevsim adi giriniz");
		String mevsim=scan.next();
		switch (mevsim) {
		case "kis":System.out.println("Aralik ocak subat");
			break;
		case "ilkbahar":System.out.println("mart  nisan mayis");
		break;
		case "yaz":System.out.println("haziran  temmuz  agustos");
		break;
		case "sonbahar":System.out.println("eylul  ekim  kasim");
		break;
		default:
			System.out.println("Yalnis bir deger girdiniz");
			break;
		}
		
	}

}
