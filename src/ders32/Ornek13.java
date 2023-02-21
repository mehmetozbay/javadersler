package ders32;

public class Ornek13 {
	public static void main(String[] args) {

		
		StringBuilder sb=new StringBuilder();
//		           012345678910
		sb.append("Java Candir");
		
		System.out.println(sb.replace(2, 6, "ali"));  //[2,6)
	}
}
