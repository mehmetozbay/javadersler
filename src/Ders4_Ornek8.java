
public class Ders4_Ornek8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi=50;
		
		int count=sayi++;
		
//		count=50 sayi=51
		System.out.println("sayi="+sayi+" count="+count);
		
	   count--;
		
		System.out.println("sayi="+sayi+" count= "+count);
		
		sayi/=3;
		System.out.println("sayi="+sayi+" count= "+count);
		
		count=++sayi;
		System.out.println("sayi="+sayi+" count= "+count);
		
		sayi*=2;
		count-=10;
		sayi=count+10;
		System.out.println("sayi="+sayi+" count= "+count);
		
	}

}
