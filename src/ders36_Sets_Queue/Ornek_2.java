package ders36_Sets_Queue;

import java.util.HashSet;
import java.util.Set;

class Employe{
	
	private String ad;
	private int maas;
	
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


public class Ornek_2 {

	public static void main(String[] args) {
		
		Employe emp1=new Employe("Ahmet", 2500);
		Employe emp2=new Employe("Sena", 3500);
		Employe emp3=new Employe("Huzeyfe", 1500);
        Set<Employe> calisanlar=new HashSet<>();
        calisanlar.add(emp1);
        calisanlar.add(emp2);
        calisanlar.add(emp3);
        System.out.println(calisanlar);
        
        for (Employe emp : calisanlar) {
        	emp.setMaas(emp.getMaas()+1000);
		}
        System.out.println(calisanlar);
	}
}
