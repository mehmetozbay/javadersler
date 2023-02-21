package ders21;

public class Ornek_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Bir integer array olusturunuz ve elemanlarin toplamini for each kullanarak yaptiriniz
		
		int arr[]= {2,4,4,6,8,10,15};
		
		int toplam=0;
		for (int each : arr) {
			toplam+=each;
		}
		
		System.out.println("sayilarin toplami "+toplam);
	}

}
