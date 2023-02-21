package Banka;

public class Calisan extends Banka {

	private String calisanAdi;
	private String calisanAdresi;
	private int calisanYasi;
	private int calisanMaasi;
	
	
	public Calisan() {
		// TODO Auto-generated constructor stub
	}

	public Calisan(String calisanAdi, String calisanAdresi, int calisanYasi, int calisanMaasi) {
		super();
		this.calisanAdi = calisanAdi;
		this.calisanAdresi = calisanAdresi;
		this.calisanYasi = calisanYasi;
		this.calisanMaasi = calisanMaasi;
	}


	@Override
	public void bilgiGetir() {
		// TODO Auto-generated method stub
		System.out.println(getCalisanAdi()+"-"+getCalisanAdresi()+"-"+getCalisanYasi()+"-"+getCalisanMaasi());
	}

	public String getCalisanAdi() {
		return calisanAdi;
	}

	public void setCalisanAdi(String calisanAdi) {
		this.calisanAdi = calisanAdi;
	}

	public String getCalisanAdresi() {
		return calisanAdresi;
	}

	public void setCalisanAdresi(String calisanAdresi) {
		this.calisanAdresi = calisanAdresi;
	}

	public int getCalisanYasi() {
		return calisanYasi;
	}

	public void setCalisanYasi(int calisanYasi) {
		this.calisanYasi = calisanYasi;
	}

	public int getCalisanMaasi() {
		return calisanMaasi;
	}

	public void setCalisanMaasi(int calisanMaasi) {
		this.calisanMaasi = calisanMaasi;
	}
}
