package ders32;

public class Ornek_5_SBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder();
		sb.append("hasan"); 
//		String a=a+"hasan"
		sb.append(" eve gel hasan");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		StringBuilder sb1=new StringBuilder("hasan");
//		System.out.println(sb1.capacity());
		
		StringBuilder sb2=new StringBuilder(5); //5 koltuk actim 
		System.out.println(sb2.capacity());
		sb2.append("ahmet ali"); //uzunluk 9
		System.out.println(sb2.capacity());//2*5+2 sana 12 lik yer actim 
		
		
		StringBuilder sb3=new StringBuilder(10);
		System.out.println(sb3.capacity());
		sb3.append("ali ");
		System.out.println(sb3.capacity());
		sb3.append("ali eve");
		System.out.println(sb3.capacity());
		
	}

}
