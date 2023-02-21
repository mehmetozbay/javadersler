package ders18;

public class Ornek_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Verilen int[] myArray={30,20,-3,50,5,0,-1} dizideki elemanlarin ortalamasini bulunuz ve
//		toplamlari ortalamadan buyuk olan sayi ciftlerini yazdiriniz
		
		
//		1-Elemanlarin toplamini bul
//		2-Dizideki eleman sayisina bolerek ortalamasini bul
//		3-dizideki elamanlari tek tek gez ve toplamlari ortalamadan buyuk olanlari yazdir
		int[] myArray={30,20,-3,50,5,0,-1};
		 int toplam=0;
		for (int i = 0; i < myArray.length; i++) {
			toplam+=myArray[i];
		}
		
		int ortalama=toplam/myArray.length;
		System.out.println(ortalama);
		
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 1; j < myArray.length; j++) {
				
				if(myArray[i]+myArray[j]>ortalama) {
					System.out.println(myArray[i]+" ile "+myArray[j]+" toplami ortalamadan ("+ortalama+") buyuktur");
				}
			}
		}
		
		
	}

}
