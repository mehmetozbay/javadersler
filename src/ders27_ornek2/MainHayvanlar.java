package ders27_ornek2;

public class MainHayvanlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kus kus=new Kus("papagan", 4);
		kus.yemekYer();
		kus.ucar();
		Balik balik=new Balik("Japon",5);
		balik.yemekYer();
		balik.yuzer();
	}
}
