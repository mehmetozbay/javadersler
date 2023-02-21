import java.util.Scanner;

public class Ders4_Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Auto widening
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Byte data tipinde bir sayi giriniz");
		
		byte number=scan.nextByte();
		System.out.println("number= "+number);
		
		short number2=number;
		
		System.out.println("number2="+number2);
		
		int number3=number2;
		
		System.out.println("number3= "+number3);
		
		
		long number4=number3;
		
		System.out.println("Number4= "+number4);
		
		float number5=number4;
		
		System.out.println("Number5= "+number5);
		
		double ahmet=number5;
		
		System.out.println("Ahmet= "+ahmet);
	}

}
