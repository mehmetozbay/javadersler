import java.util.Scanner;

public class Ders3_Scanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Ilk tamsayiyi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int sayi2=scan.nextInt();
		System.out.println("sayilarin toplami="+(sayi1+sayi2));
		System.out.println("Sayilarin farki="+(sayi1-sayi2));
		System.out.println("sayilarin carpimi= "+(sayi1*sayi2));
		System.out.println("sayilarin bolumu="+(sayi1/sayi2));
	}

}
