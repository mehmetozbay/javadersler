package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Kullanicidan gun ismini alip hafta ici yada hafta sonu oldugunu yazdiriniz
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir gun adi giriniz");
		String gun=scan.next();
		
		switch (gun) {
		case "pazartesi":
			System.out.println("hafta ici");
			break;
		case "sali":
			System.out.println("hafta ici");
			break;
		case "carsamba":
			System.out.println("hafta ici");
			break;
		case "persembe":
			System.out.println("hafta ici");
			break;
		case "cuma":
			System.out.println("hafta ici");
			break;
		case "cumartesi":
			System.out.println("hafta sonu");
			break;
		case "pazar":
			System.out.println("hafta sonu");
			break;
		default:
			System.out.println("yalnis bir gun girdiniz");
			break;
		}
		
	}

}
