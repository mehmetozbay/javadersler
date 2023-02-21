package ders15;

import java.util.Scanner;

public class Ornek_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Kullanicidan bir String isteyiniz indexi cift olanlari yazdiriniz
		Scanner in = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime = in.nextLine();
        int uzunluk = kelime.length();
        int i = 0;

        while (i < uzunluk) {
            char ch = kelime.charAt(i);
            if (kelime.indexOf(ch) % 2 == 0) {
                System.out.println(ch);
            } 
            i++;
        }

}

}
