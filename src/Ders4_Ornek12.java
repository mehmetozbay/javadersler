import java.util.Scanner;

public class Ders4_Ornek12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tabani giriniz");
		int taban=scan.nextInt();
		System.out.println("Ussu giriniz");
		int us=scan.nextInt();
		int sonuc=(int) Math.pow(taban, us);
		System.out.println("sonuc="+sonuc);
	}

}
