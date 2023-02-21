package ders23;

public class MainGaleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bir Galeri Sistemi olusturunuz
//		Arac adinda bir class olusturunuz (Marka, Renk) 
//		Musteri adinda bir class olusturunuz. (Adi, Yas)
//		Siparis diye bir Class olusturunuz ve Siparis ekleyiniz (Musteri, Arac, SiparisTarihi).
		
//		Siyah Opel aracinizi 25 yasindaki Samet adli Musteriye 21.10.2022 tarihinde sattiniz
		Arac arc=new Arac("Opel", "Siyah");
		Musteri mst=new Musteri("Samet", 25);
		Siparis sp=new Siparis(arc, mst, "21.10.2022");
		sp.yazdir();
		Arac arc2=new Arac("Mazda", "Beyaz");
		Musteri mst2=new Musteri("Ali", 28);
		Siparis sp2=new Siparis(arc2, mst2, "22.10.2022");
		sp2.yazdir();
		
//		Kutuphane sistemi olusturun 
//		Kitap adi yazar Adi
//		Okur adi yasi
//		Odunc kitap okur kitap teslim zamani
//		yazdir
	}

}
