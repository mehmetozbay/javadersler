package ders25_ornek1;

public class Arac {

    private String vitesTuru;
    private String marka;
    private String model;
    
    public Arac() {
		// TODO Auto-generated constructor stub
	}
	public Arac(String vitesTuru, String marka, String model) {
		this.vitesTuru = vitesTuru;
		this.marka = marka;
		this.model = model;
	}
	
	
	public String getVitesTuru() {
		return vitesTuru;
	}
	public void setVitesTuru(String vitesTuru) {
		this.vitesTuru = vitesTuru;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Arac [vitesTuru=" + vitesTuru + ", marka=" + marka + ", model=" + model + "]";
	}
    
    
    
	
}
