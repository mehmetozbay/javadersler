package ders10;

import java.util.Scanner;

public class Ders10_Ornek14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bir cumlede kelimenin kullanilip kullanilmadigini ogrenme
//		-Cumlede kullanilmamis
//		-1 kez kullanilmis
//		-Birden cok kullanilmis
		Scanner scan=new Scanner(System.in);
//		012345678910
//		ali eve ali  0==8
//		eve           4==4
		System.out.println(" Bu bir kelima rama uygulamasidir Lutfen bir cumle giriniz ");
		String cumle=scan.nextLine();
		System.out.println("Lutfen aramak istediginiz kelime giriniz");
		String kelime=scan.nextLine();
		int bastanArama=cumle.indexOf(kelime);
		int sondanArama=cumle.lastIndexOf(kelime);
		if(bastanArama==-1) {
			System.out.println("kelime cumlede yok");
		}else if(bastanArama==sondanArama) {
			System.out.println("Kelime cumlede bir kez kullanilmistir");
			
		}else {
			System.out.println("kelime cumlede birden cok kullanilmistir");
		}
		
	}

}
