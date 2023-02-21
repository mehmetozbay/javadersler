package ders42;

import java.util.Arrays;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		List<Integer> sayilar=Arrays.asList(122,65,87,7864,36,-5);
		
//		sayilar.stream().map(Methods::kareAl).forEach(Methods::yazdir);
		
//		Listteki her bir elemanin rakamlari toplamini yazdiran kod
		
		sayilar.stream().map(Methods::rakamlarToplamiBul).forEach(Methods::yazdir);
		
		
	}

}
