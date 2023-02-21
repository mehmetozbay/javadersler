package ders10;

public class Ders10_Ornek16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Kullanicidan alisfiyati=“$25.25” kargo=“$15.25” 
//		toplam tutari yazdiriniz
		
		String fiyat="$25.25";
		String kargo="$15.25";
		fiyat=fiyat.substring(1);
		kargo=kargo.substring(1);
		
		System.out.println(fiyat+kargo);
   double yeniFiyat=Double.parseDouble(fiyat);
   double yeniKargo=Double.parseDouble(kargo);
   System.out.println("Toplam Tutar $"+(yeniFiyat+yeniKargo));

		
	}

}
