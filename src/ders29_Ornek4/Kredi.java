package ders29_Ornek4;

public abstract class Kredi {

	
	private int istenilenPara;
	
	public Kredi() {
		// TODO Auto-generated constructor stub
	}

	public Kredi(int istenilenPara) {
		super();
		this.istenilenPara = istenilenPara;
	}

	public abstract void bilgiVer();
	public abstract double krediHesapla();
	
	
	public int getIstenilenPara() {
		return istenilenPara;
	}

	public void setIstenilenPara(int istenilenPara) {
		this.istenilenPara = istenilenPara;
	}
	
}
