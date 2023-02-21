import java.util.Scanner;

public class Ders4_Ornek11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		kullanicidan 3 bassamakli sayi isteyip 3 basmakli sayinin birler onlar yuzler basamagindaki sayilarin toplamini bulunuz
		
//		ornek 125;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 3 basamakli birsayi giriniz");
		
		int sayi=scan.nextInt();
//		sayi 125
		int birlerBasamagi=sayi%10;
//		birlerbasamagi=5
		
		sayi=sayi/10;
//		sayi=12;
		int onlarBasamagi=sayi%10;
//		onlar basamagi=2
		int yuzlerBasamagi=sayi/10;
		
		System.out.println("Rakamlari Toplami "+(birlerBasamagi+onlarBasamagi+yuzlerBasamagi));
		
	}

}
