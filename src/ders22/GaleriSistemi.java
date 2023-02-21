package ders22;

import java.util.Scanner;

public class GaleriSistemi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Araba car = new Araba();
		car.renk = "Kirmizi";
		car.marka = "Mazda";
		car.modelYili = "2020";
		car.fiyat = 20000;
		Araba car2 = new Araba();
		car2.fiyat = 25000;
		car2.renk = "mavi";
		car2.modelYili = "2015";
		car2.marka = "Opel";
        Araba car3=new Araba();
		System.out.println("Araba markasi giriniz");
		car3.marka=scan.nextLine();
		System.out.println("Arabanin rengini giriniz");
		car3.renk=scan.nextLine();
		System.out.println("Arabanin fiyatini giriniz");
		car3.fiyat=scan.nextInt();
		scan.nextLine();
		System.out.println("Arabanin model yilini giriniz");
		car3.modelYili=scan.nextLine();
		
		System.out.println("Olusturulan araba "+car3.marka+"\nModel "+car3.modelYili+"\nRenk "+car3.renk+"\nfiyat"+car3.fiyat);
//		private=>Sadece class icerisinden erisilir
//		protected => Ayni package icerisinden her classdan erisilir
//		public =>her  yerden erisilir
		
		Araba car4=new Araba("BMW","2020" , "Beyaz", 12000);
		System.out.println(car4.renk);
        Araba car5=new Araba("mavi");
        
        
	}

}
