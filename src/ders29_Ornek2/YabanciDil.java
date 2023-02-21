package ders29_Ornek2;

public class YabanciDil extends Ogrenci {

	public YabanciDil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YabanciDil(String ad, int numara) {
		super(ad, numara);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bilgiVer() {
		System.out.println(getAd()+" kisi yabanci dil bolumunun ogrencisidir");
		
	}

}
