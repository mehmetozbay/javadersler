package ders8_switch;

import java.util.Scanner;

public class Ders8_Ornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan yilin kacinci ay oldugunu sorun ve ay ismini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kacinci ayi ogrenmek istiyorsunuz");
		int sayi=scan.nextInt();
		
		switch (sayi) {
		case 1: System.out.println("Ocak");
			break;
		case 2: System.out.println("Subat");
		break;
		case 3: System.out.println("Mart");
		break;
		case 4: System.out.println("Nisan");
		break;
		case 5: System.out.println("Mayis");
		break;
		case 6: System.out.println("Haziran");
		break;
		case 7: System.out.println("Temmuz");
		break;
		case 8: System.out.println("Agustos");
		break;
		case 9: System.out.println("Eylul");
		break;
		case 10: System.out.println("Ekim");
		break;
		case 11: System.out.println("Kasim");
		break;
		case 12: System.out.println("Aralik");
		break;
		default:
			System.out.println("Lutfen 1 ile 12 arasinda bir deger giriniz");
			break;
		}
		
	}

}
