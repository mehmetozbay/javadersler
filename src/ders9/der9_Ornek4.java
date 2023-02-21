package ders9;

public class der9_Ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="ali";
		String str1="Ali";
		int a=1, b=2;
		boolean esitSayiMi = a==b;
		boolean esitMi=str.equalsIgnoreCase(str1);
//		esitMi==true esitMi
//		!
		if(!esitMi) {
			System.out.println("Ikisi de farkli");	
		}else {
			System.out.println("ikisi de ayni");
		}
		
		
	}

}
