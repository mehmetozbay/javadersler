package ders24_ornek_2;

import java.util.List;
import java.util.Scanner;

public class MainRegister {

//) User classini olusturunuz (Ad, Dogum Yili)
//Registration isminde baska bir Class olusturunuz. 
//Burada kisiEkle, listele, sil guncelle, Yetiskin olanlari methodlarini yazdiriniz
//MainRegister adinda baska bir Class olusturunuz Burada menu olusturunuz

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		boolean cikilsinMi=false;
		
		Registration reg= new Registration();
		
		List<User> users = null;
		
		while (!cikilsinMi) {
			System.out.println("1-Kisi Ekle \n2-Listele \n3-Sil \n4-Guncelle\n5-Cikis");
			int sec=scan.nextInt();
			scan.nextLine();
			switch (sec) {
			case 1:
				users=reg.userEkle();
				break;
			case 2:
				if (users!=null) {
					 reg.listele(users);
				}else {
					System.out.println("Lutfen ilk once kisi ekleyiniz");
				}
				break;
			case 3:
				if (users!=null) {
					users= reg.userSil(users);
				}else {
					System.out.println("Lutfen ilk once kisi ekleyiniz");
				}
				break;
			case 4:
				if (users!=null) {
					users= reg.userGuncelle(users);
				}else {
					System.out.println("Lutfen ilk once kisi ekleyiniz");
				}
				break;
			case 5:
				 cikilsinMi=true;
				break;
			default:
				System.out.println("Yalnis bir deger giriniz");
				break;
			}
			
			
		}
		
		
	}

}
