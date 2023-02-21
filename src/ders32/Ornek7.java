package ders32;

public class Ornek7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		StringBuilder sb=new StringBuilder();
//		           0123456
		sb.append("ali can");
//		System.out.println(sb.length()); // sbnin uzunlugunu bize verir
//		System.out.println(sb.charAt(4));//index e karsilik gelen karakteri verir
//	    System.out.println(sb.delete(0, 4));//[0,4) indexleri arasindaki karakterleri siler
//                012
	    //	    can
	    System.out.println(sb.deleteCharAt(2));//2 nolu index teki karakteri siler
	}

}
