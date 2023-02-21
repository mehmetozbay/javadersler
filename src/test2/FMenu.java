package test2;

import java.util.Scanner;

public class FMenu {

	Scanner scan=new Scanner(System.in);
	public void menuYap() {
		
	
			
			int sec=0;
			boolean cikis=false;
			while(!cikis)
			{
			System.out.println("Musteri islemleri icin 1 Hesap islemleri icin 2  Cikis islemleri icin 3 tiklayiniz");
			sec=scan.nextInt();
			scan.nextLine();
			switch (sec) {
			case 1:
				musteriMenu();
				break;
			case 3:
				cikis=true;
				break;
			default:
				break;
			}
			
			}
			
	

	}
	
	
	
	private void musteriMenu() {
		int key=0;
		boolean cikis=false;
		FMusteri musteriForm=new FMusteri();
		while (!cikis) {
			System.out.println("Musteri eklemek icin 1 Musteri silmek icin 2 Musteri giuncellemek icin "
					+ "3 musterileri getirmek icin 4  musteri Bilgisi getirmek icin 5 Cikis 6");
		  key=scan.nextInt();
			switch (key) {
			case 1:
				musteriForm.ekle();
				break;
			case 2:
				musteriForm.sil();
				break;
			case 3:
				musteriForm.guncelle();
				break;
			case 4:
				musteriForm.getMusteriler();
				break;
			case 5:
				musteriForm.getMusteri();
				break;
			case 6:
				cikis=true;
				break;
			default:
				break;
			}
		}
	}



	


	
}
