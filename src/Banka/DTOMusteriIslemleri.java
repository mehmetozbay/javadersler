package Banka;

import java.util.ArrayList;
import java.util.List;

public class DTOMusteriIslemleri implements IMusteriIslemleri {

	static List<Musteri> musteriler = new ArrayList<>();

	@Override
	public void ekle(Musteri musteri) {

		musteriler.add(musteri);
		System.out.println("Sayin " + musteri.getMusteriAdi() + " sisteme basari ile eklendi");

	}

	@Override
	public void sil(int id) {
	
		for (int i = 0; i < musteriler.size(); i++) {
			if(musteriler.get(i).getId()==id) {
				musteriler.remove(i);
			}
		}
        System.out.println("Silme islemleri basari ile gerceklesti");
	}

	@Override
	public void guncelle(int id, Musteri guncelMusteri) {
		for (int i = 0; i < musteriler.size(); i++) {
			if(musteriler.get(i).getId()==id) {
				guncelMusteri.setId(id);
				Musteri.sayi--;
				musteriler.set(i, guncelMusteri);
				
			}
		}
	}

	@Override
	public void bilgiGetir(int id) {
		// TODO Auto-generated method stub
		for (Musteri musteri : musteriler) {
			if (musteri.getId() == id) {
				System.out.println(musteri.getId() + "-" + musteri.getMusteriAdi() + "-" + musteri.getMusteriYasi()
						+ "-" + musteri.getMusteriAdresi());
			}
		}
	}

	@Override
	public void hepsiniGetir() {

		for (Musteri musteri : musteriler) {
			System.out.println(musteri.getId() + "-" + musteri.getMusteriAdi() + "-" + musteri.getMusteriYasi() + "-"
					+ musteri.getMusteriAdresi());
		}
	}

}
