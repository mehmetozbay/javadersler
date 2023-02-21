package test2;

public class Hesap extends Banka {

	private Musteri musteri;
	private String hesapNo;
	private int bakiye;
	
	
	public Hesap() {
		// TODO Auto-generated constructor stub
	}
	public Hesap(Musteri musteri, String hesapNo, int bakiye) {
		super();
		this.musteri = musteri;
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
	}
	
	
	public Musteri getMusteri() {
		return musteri;
	}
	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}
	public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	public int getBakiye() {
		return bakiye;
	}
	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	
	
	
}
