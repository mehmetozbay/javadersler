import java.util.Scanner;

public class Ders4_Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanicidan birinci yazili, ikinci yazili ve sozlu notalarini isteyip ortalamasini ekrana yazan kodu yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Birinci yazili notunu giriniz");
		int birinciYazili=scan.nextInt();
		System.out.println("Ikinci yazili notunu giriniz");
		int ikinciYazili=scan.nextInt();
		System.out.println("Sozlu notunu giriniz");
		int sozlu=scan.nextInt();
		int ortalama=(birinciYazili+ikinciYazili+sozlu)/3;
		System.out.println("Ortalamaniz= "+ortalama);
		
	}

}
