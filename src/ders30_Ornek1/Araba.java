package ders30_Ornek1;

public abstract class Araba {

	private String model;
	private String yakitTuru;
	private String vitesTuru;
	
	public Araba() {
		// TODO Auto-generated constructor stub
	}
	public Araba(String model, String yakitTuru, String vitesTuru) {
		super();
		this.model = model;
		this.yakitTuru = yakitTuru;
		this.vitesTuru = vitesTuru;
	}
	
	public abstract void yakitTuruBelirle();
	public abstract void vitesTuruBelirle();
	public abstract void modelTuruBelirle();
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYakitTuru() {
		return yakitTuru;
	}
	public void setYakitTuru(String yakitTuru) {
		this.yakitTuru = yakitTuru;
	}
	public String getVitesTuru() {
		return vitesTuru;
	}
	public void setVitesTuru(String vitesTuru) {
		this.vitesTuru = vitesTuru;
	}
	
}
