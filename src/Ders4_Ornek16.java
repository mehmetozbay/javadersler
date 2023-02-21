
public class Ders4_Ornek16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sayi=12.5555555;
		
//		sayi=12.555555
//		sayi=sayi*100 sayi=1255.55555
//		Math.raund(sayi)  yuvarlana sayi 1256.0
//		sayi 100 ile carparsam yuvarlanasayi=1256.0 tekrar 100 e bolersek 12.56 
//		istenilen 12.56 
		double yuvarlananSayi=(double)Math.round(sayi*10)/10;
		System.out.println(yuvarlananSayi);	
	}

}
