package test;

import java.util.List;
import java.util.Scanner;

public class MainRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		boolean cikilsinMi = false;
		int sec;
		Registeration regUser = new Registeration();
		List<User> users = null;
		while (!cikilsinMi) {
			System.out.println("1- Kisi ekle\n2-Listele\n3-Yetiskinler\n4-Sil\n5-Guncelle\n6-Cikis");
			sec = scan.nextInt();
			scan.nextLine();
			switch (sec) {
			case 1:
				users = regUser.ekle();
				break;
			case 2:
				if (users != null) {
					regUser.listele(users);
				}else {
					System.out.println("Ilk once kisi ekleyiniz");
				}
				break;
			case 3:
				if (users != null) {
					regUser.dogumTarihi(users);
				}else {
					System.out.println("Ilk once kisi ekleyiniz");
				}
				break;
//			case 4:
//				if (users != null) {
//					users = regUser.sil(users);
//				}else {
//					System.out.println("Ilk once kisi ekleyiniz");
//				}
//				break;
//			case 5:
//				if (users != null) {
//					users = regUser.guncelle(users);
//				}else {
//					System.out.println("Ilk once kisi ekleyiniz");
//				}
//				break;
			case 6:
				cikilsinMi = true;
				break;
			default:
				System.out.println("yalnis bir deger girdiniz");
				break;
			}
		}

	}

}
