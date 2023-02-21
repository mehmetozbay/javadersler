package ders26_ornek1;

public class Arac {
	
	private String aracMarka;
	private String vitesTuru;
	
	
	public Arac() {
		// TODO Auto-generated constructor stub
	}


	public Arac(String aracMarka, String vitesTuru) {
		super();
		this.aracMarka = aracMarka;
		this.vitesTuru = vitesTuru;
	}


	public String getAracMarka() {
		return aracMarka;
	}


	public void setAracMarka(String aracMarka) {
		this.aracMarka = aracMarka;
	}


	public String getVitesTuru() {
		return vitesTuru;
	}


	public void setVitesTuru(String vitesTuru) {
		this.vitesTuru = vitesTuru;
	}


	@Override
	public String toString() {
		return "Arac [aracMarka=" + aracMarka + ", vitesTuru=" + vitesTuru + "]";
	}
	
	
	

}
