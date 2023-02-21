package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registeration {

	
	List<User> users=new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	public List<User> ekle() {
		System.out.println("Lutfen Adinizi giriniz");
		String name=scan.nextLine();
		System.out.println("Dogum yilini giriniz");
		int yil=scan.nextInt();
		scan.nextLine();
		User user=new User(yil, name);
		users.add(user);
		return users;
	}
//	-----------Kisi Listeleme-------------------->>
	public void listele(List<User> listUsers) {
		for (int i = 0; i < listUsers.size(); i++) {
			System.out.println((i+1)+"-"+listUsers.get(i));
		}
	}
	
	
	
//	-------------------------------------------------------->>>>>
	
	public void dogumTarihi(List<User> listUsers) {
		System.out.println("Yetiskin olanlar");
		for (User user : listUsers) {
			if(2022-user.yil>18) {
				System.out.println(user.name);
			}
		}
	}
	
////	----------------Silme--------------------->>
//	
//	public List<User> sil( List<User> users) {
//		// TODO Auto-generated method stub
//        listele(users);
//        System.out.println("Hangi kullaniciyi silmek istiyorsunuz");
//        int index=scan.nextInt();
//        users.remove(index);
//        return users;
//	}
//	
////	----------------Guncelle--------------------->>
//	
//	public List<User> guncelle( List<User> users) {
//		// TODO Auto-generated method stub
//        listele(users);
//        System.out.println("Hangi kullaniciyi guncellemek istiyorsunuz");
//        int index=scan.nextInt();
//        System.out.println("Lutfen Adinizi giriniz");
//		String name=scan.nextLine();
//		System.out.println("Dogum yilini giriniz");
//		int yil=scan.nextInt();
//		scan.nextLine();
//		User user=new User(yil, name);
//        users.set(index, user);
//        return users;
//	}
	
}
