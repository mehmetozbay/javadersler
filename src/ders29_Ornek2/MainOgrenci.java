package ders29_Ornek2;

public class MainOgrenci {
	public static void main(String[] args) {
		Sayisal sayisalOgr=new Sayisal("Can", 155);
		sayisalOgr.bilgiVer();
        YabanciDil ydilOgr=new YabanciDil("Sena",235);
        ydilOgr.bilgiVer();
        Sozel sozelOgr=new Sozel("Zeynep", 185);
        sozelOgr.bilgiVer();
	}
}
