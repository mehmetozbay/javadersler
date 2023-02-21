import java.util.Scanner;

public class Ders3_Ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//				Kullanicidan bir tamsayi isteyiniz karesini aliniz ekrana yazdirinz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
		System.out.println("sayilarin karesi= "+(sayi*sayi));
		scan.close();
	}

}
