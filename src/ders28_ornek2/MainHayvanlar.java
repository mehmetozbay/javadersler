package ders28_ornek2;

public class MainHayvanlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hayvanlar hayvan= new Hayvanlar("Sazan", 2);
		hayvan.yemekYe();
		Memeliler memeli=new Memeliler("Kedi", 3);
		memeli.yemekYe();
		
		Kuslar kus=new Kuslar("Kartal",3);
		kus.yemekYe();
	}

}
