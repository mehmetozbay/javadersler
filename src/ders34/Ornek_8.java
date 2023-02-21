package ders34;

import java.util.Arrays;
import java.util.LinkedList;

public class Ornek_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> sayilar = new LinkedList<>(Arrays.asList(1, 5, 7, 8, 10));
		System.out.println(sayilar);
		sayilar.remove(2);
		System.out.println("2 nolu index teki eleman silindi " + sayilar);
		int index = sayilar.indexOf(8);
		System.out.println(" 8 i sistemden silmek istiyoruz 8 in index numarasi bulundu " + index);
		sayilar.remove(index);//8 in bulundugu index  silindi
		System.out.println("8 sistemden silindi " + sayilar);
	}
}
