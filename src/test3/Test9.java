package test3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

class Employe{
	String ad;
	int maas;
	public Employe() {
		// TODO Auto-generated constructor stub
	}
	public Employe(String ad, int maas) {
		super();
		this.ad = ad;
		this.maas = maas;
	}
	@Override
	public String toString() {
		return "Employe [ad=" + ad + ", maas=" + maas + "]";
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	
}

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe emp1 =new Employe("Can", 4000);
		Employe emp2 =new Employe("Ali", 5000);
		Employe emp3 =new Employe("Hasan", 6000);
		
		Set<Employe> isciler= new HashSet<>();
		isciler.add(emp3);
		isciler.add(emp2);
		isciler.add(emp1);
		System.out.println(isciler);
		
	   for (Employe employe : isciler) {
		employe.setMaas(employe.getMaas()+1000);
	}
	   
	   System.out.println(isciler);
	}

}
