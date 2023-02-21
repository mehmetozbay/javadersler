package ders20;
import java.util.Arrays;
import java.util.Scanner;

public class Ornek_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstArr[][] = new int[2][2];
		int secondArr[][] = new int[2][2];
		int sonuc[][] = new int[2][2];

		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk Arrayi olusturalim");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("[" + i + "," + j + "] elemani giriniz");
				firstArr[i][j] = scan.nextInt();
			}
		}

		
		
		System.out.println("Ikinci Arrayi olusturalim");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("[" + i + "," + j + "] elemani giriniz");
				secondArr[i][j] = scan.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(firstArr));
		System.out.println(Arrays.deepToString(secondArr));

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				sonuc[i][j] = firstArr[i][j] + secondArr[i][j];
			}
		}

		System.out.println("Sonuc = " + Arrays.deepToString(sonuc));

	}

}
