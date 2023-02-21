package Banka;

public class Hesap  {

	
	private Musteri musteri;
	private String ibanNo;
	private int bakiye;
	
	public Hesap() {
		// TODO Auto-generated constructor stub
	}
	public Hesap(Musteri musteri, String ibanNo, int bakiye) {
		super();
		this.musteri = musteri;
		this.ibanNo = ibanNo;
		this.bakiye = bakiye;
	}
	public Musteri getMusteri() {
		return musteri;
	}
	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}
	public String getIbanNo() {
		return ibanNo;
	}
	public void setIbanNo(String ibanNo) {
		this.ibanNo = ibanNo;
	}
	public int getBakiye() {
		return bakiye;
	}
	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
}
