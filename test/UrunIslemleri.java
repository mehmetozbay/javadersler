package test;

import java.util.ArrayList;
import java.util.List;

public class UrunIslemleri {
	
	List<Urun> urunler=new ArrayList<>();
	public List<Urun> urunEkle(Urun urun) {
		// TODO Auto-generated method stub
		urunler.add(urun);
		System.out.println(urunler);
		return urunler;
	}
	public List<Urun> urunSil(int  index) {
		// TODO Auto-generated method stub
		urunler.remove(index);
		return urunler;
	}
	public List<Urun> urunGuncelle(int  index, Urun urun) {
		// TODO Auto-generated method stub
		urunler.set(index, urun);
		return urunler;
	}
	public void urunListele(List<Urun> urunler) {
		// TODO Auto-generated method stub
		for (Urun urun : urunler) {
			System.out.println(urun);
		}
	}
}
