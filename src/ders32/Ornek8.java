package ders32;

public class Ornek8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuilder sb=new StringBuilder();
//		           01234
		sb.append("Ahmet Oran");
		System.out.println(sb.delete(0, 4));
//		012345
//		t Oran
		System.out.println(sb.deleteCharAt(3));
//		t Oan
		
		
	}

}
