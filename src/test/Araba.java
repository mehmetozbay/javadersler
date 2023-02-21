package test;

public abstract class Araba {

	String model;
	String yakit;
	String vites;
	
	public Araba() {
		// TODO Auto-generated constructor stub
	}
	public Araba(String model, String yakit, String vites) {
		super();
		this.model = model;
		this.yakit = yakit;
		this.vites = vites;
	}
	
    public abstract void yakitTipiBelirle();
    
    public abstract void vitestipiBelirle();
    
    public abstract void modelBelirle();
}
