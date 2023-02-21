package ders12;

import java.util.Scanner;

public class Ders12_Ornek13 {
//	 Atm uygulamasini method kullanarak yapiniz Bakiyede 1000 lira var
//	 1-Bakiye
//	 2-Para Cekme (Cekilen miktar bakiyeden fazla olamaz )
//	 3-Para Yatirma
	
	static Scanner scan=new Scanner(System.in);
	static int balance=1000;
	public static void main(String[] args) {

		menuOlustur();
		
	}
	private static void menuOlustur() {
		// TODO Auto-generated method stub
		
		System.out.println("Bakiye icin 1 para yatirma icin 2 para cekme icin 3 u tiklayiniz");
		int sec=scan.nextInt();
		switch (sec) {
		case 1:
			bakiyeSorgula();
			break;
		case 2:
			paraYatir();
			break;
		case 3:
			paraCek();
			break;
		default:
			break;
		}
	}
	private static void paraCek() {
		// TODO Auto-generated method stub
		System.out.println("Ne kadar para cekmek istiyorsunuz");
		int cekilenPara=scan.nextInt();
		if(cekilenPara>balance) {
			System.out.println("Hesabinizda bu kadar para yok");
		}else {
			System.out.println("Toplam paraniz"+(balance-cekilenPara));
		}
	}
	private static void paraYatir() {
		// TODO Auto-generated method stub
		System.out.println("Ne kadar yatirmak istiyorsunuz");
		int yatirilanPara=scan.nextInt();
		System.out.println("Toplam para "+(balance+yatirilanPara));
	}
	private static void bakiyeSorgula() {
		// TODO Auto-generated method stub
		System.out.println("Mevcut bakiyeniz "+balance);
	}

}
