package ders32;

public class Ornek_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		StringBuilder sb=new StringBuilder();
		
		sb.append("sena");
		System.out.println(sb);
		sb.append(" zeynep");
		System.out.println(sb);
//		           01234  [0,4)
		sb.append(" Nergis",0,4);
		System.out.println(sb);
		sb.append("Yunus");
		System.out.println(sb.capacity());
	}

}
