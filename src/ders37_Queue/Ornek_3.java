package ders37_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

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


class Karsilastirma  implements Comparator<Employe> {

	@Override
	public int compare(Employe calisan1, Employe calisan2) {
		// TODO Auto-generated method stub
		return calisan2.getMaas()-calisan1.getMaas();
	}
	
}


public class Ornek_3 {
//Kullanicidan 3 iscini(Employe)  maas ve isim bilgisi isteyin Maasi buyukten kucuge dogru siralayin  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Queue<Employe> calisanlar=new PriorityQueue<>(new Karsilastirma());
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+". calisanin adini giriniz");
			String ad=scan.nextLine();
			System.out.println((i+1)+". calisanin maasini giriniz");
			int maas=scan.nextInt();
			scan.nextLine();
			Employe emp=new Employe(ad, maas);
			calisanlar.add(emp);
		}
		System.out.println(calisanlar);
		
		while (!calisanlar.isEmpty()) {
			System.out.println(calisanlar.poll());
		}
		
	}
}
