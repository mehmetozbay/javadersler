package ders18;

public class Ornek_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Verilen int[] myArray={2,4,-3,-5,5,0,-1} arrayinde toplamlari -1 e esit olan
//		sayi ciftlerini
//				yazdiriniz
		
		int[] myArray={2,4,-3,-5,5,0,-1};
		int toplam=0;
		for (int i = 0; i < myArray.length; i++) {
			for (int j = i+1; j < myArray.length; j++) {
				if(myArray[i]+myArray[j]==-1) {
					System.out.println(myArray[i]+"ile"+myArray[j]+" nin toplami -1 dir");
				}
			}
		}
	}

}
