package test;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String satz=" Java cok guzel bir dildir  ";
		satz=satz.trim();
		System.out.println(satz);
		satz=satz.replace("k", "k123");
		System.out.println(satz);
		satz=satz.replace("c", "C");
		System.out.println(satz);
		String ad="11112222";
		String yeniAd=ad.substring(0,ad.length()-4);
		
		System.out.println(yeniAd.replaceAll("\\w", "*")+ad.substring(ad.length()-4));
	}

}
