package ders29_Ornek4;

public class Ihtiyac extends Kredi {

	public Ihtiyac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ihtiyac(int istenilenPara) {
		super(istenilenPara);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void bilgiVer() {
		System.out.println("Ihtiyac Krediniz onaylandi Odeyeceginiz tutar "+krediHesapla());
	}

	@Override
	public double krediHesapla() {
		double krediTutari=getIstenilenPara()*105/100;
		return krediTutari;
	}

}
