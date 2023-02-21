package ders29_Ornek4;

public class Emlak extends Kredi {

	public Emlak() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emlak(int istenilenPara) {
		super(istenilenPara);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bilgiVer() {
		// TODO Auto-generated method stub
		System.out.println("Emlak Krediniz onaylandi Odeyeceginiz tutar "+krediHesapla());
	}
	@Override
	public double krediHesapla() {
		double krediTutari=getIstenilenPara()*110/100;
		return krediTutari;
	}

}
