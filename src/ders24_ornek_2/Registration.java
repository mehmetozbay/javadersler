package ders24_ornek_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

	List<User> users = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

//	-------------Ekle-------------------------->>>
	public List<User> userEkle() {
		System.out.println("Adiniz nedir");
		String ad = scan.nextLine();
		System.out.println("Dogum yiliniz nedir");
		int dYili = scan.nextInt();
		scan.nextLine();
		User user = new User(ad, dYili);
		users.add(user);
		return users;
	}

//	----------Listele--------------------------->>

	public void listele(List<User> listelenenUsers) {
		// TODO Auto-generated method stub

		for (int i = 0; i < listelenenUsers.size(); i++) {
			System.out.println((i + 1) + " - " + listelenenUsers.get(i).adi + " " + listelenenUsers.get(i).dYili);
		}
	}

//	----------Sil--------------------------->>

	public List<User> userSil(List<User> listeuser) {
		// TODO Auto-generated method stub
		listele(listeuser);
		System.out.println("Hangi kullaniciyi silmek istersiniz");
		int index = scan.nextInt();
		scan.nextLine();
		listeuser.remove(index - 1);
		return listeuser;

	}
	
	
//	----------Guncelle--------------------------->>
	
	public List<User> userGuncelle(List<User> listeuser) {
		listele(listeuser);
		System.out.println("Hangi kullaniciyi guncellemek istersiniz");
		int index = scan.nextInt();
		scan.nextLine();
		System.out.println("Yeni Ad nedir");
		String ad = scan.nextLine();
		System.out.println("Yeni Dogum yili nedir");
		int dYili = scan.nextInt();
		scan.nextLine();
		User user = new User(ad, dYili);
		listeuser.set(index-1, user);
		return listeuser;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
