package Banka;

public class Musteri extends Banka {

	private int id;
	private String musteriAdi;
	private String musteriAdresi;
	private int musteriYasi;
	public static int sayi;
	
	public Musteri() {
		// TODO Auto-generated constructor stub
		sayi++;
		id=sayi;
	}
	
	public Musteri(String musteriAdi, String musteriAdresi, int musteriYasi) {
		super();
		this.musteriAdi = musteriAdi;
		this.musteriAdresi = musteriAdresi;
		this.musteriYasi = musteriYasi;
		sayi++;
		id=sayi;
	}

	@Override
	public void bilgiGetir() {
		// TODO Auto-generated method stub
		System.out.println(getMusteriAdi()+"-"+getMusteriAdresi()+"-"+getMusteriYasi());
	}

	
	
	public String getMusteriAdi() {
		return musteriAdi;
	}

	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}

	public String getMusteriAdresi() {
		return musteriAdresi;
	}

	public void setMusteriAdresi(String musteriAdresi) {
		this.musteriAdresi = musteriAdresi;
	}

	public int getMusteriYasi() {
		return musteriYasi;
	}

	public void setMusteriYasi(int musteriYasi) {
		this.musteriYasi = musteriYasi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	
}
