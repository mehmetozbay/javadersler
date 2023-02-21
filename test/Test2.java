package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bakiye = 1000;

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir secenek giriniz");
		int sec = scan.nextInt();
		switch (sec) {
		case 1:
			System.out.println("bakiye " + bakiye);
			break;
		case 2:
			System.out.println("Ne kadar cekmek istiyorsunuz");
			int cekilenPara = scan.nextInt();
			if (cekilenPara < bakiye) {
				System.out.println("kalan para " + (bakiye - cekilenPara));
			} else {
				System.out.println("bu kadar cekemezsiniz");
			}

			break;
		case 3:
			System.out.println("Ne kadar yatirmak istiyorsunuz");
			int yatirilanPara = scan.nextInt();
			System.out.println("kalan para " + (bakiye + yatirilanPara));
			break;
		default:
			break;
		}

	}

}
