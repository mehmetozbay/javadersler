package Banka;

public interface IMusteriIslemleri {

	void ekle(Musteri musteri);
	void sil(int id);
	void guncelle(int id, Musteri guncelMusteri );
	void bilgiGetir(int id);
	void hepsiniGetir();
	
}
