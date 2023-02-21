package test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DTOMusteri implements IMusteri  {
	public static List<Musteri> musteriler= new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	@Override
	public void add(Musteri musteri) {
		System.out.println("Sayin "+musteri.getAdi()+" sistemimize kaydiniz basari ile gerceklesmistir");
		musteriler.add(musteri);
	}

	@Override
	public void update(int id, Musteri m) {
		for (int i = 0; i <musteriler.size(); i++) {
			if (musteriler.get(i).getId()==id) {
				
				musteriler.set(i, m);
				break;
			}
		}
		System.out.println("guncelleme islemi basari ile gerceklesmistir");
		
	}

	@Override
	public void delete(int id) {
		
		for (int i = 0; i <musteriler.size(); i++) {
			if (musteriler.get(i).getId()==id) {
				musteriler.remove(i);
				break;
			}
		}
		System.out.println("silme islemi basari ile gerceklesmistir");
	}

	@Override
	public void getMusteri(int id) {
	
		
		for (Musteri musteri : musteriler) {
			if (musteri.getId()==id) {
				System.out.println("Musteri Bilgileri\nAd: "+musteri.getAdi()+"\nYas: "+musteri.getYas()+"\nAdres:"+musteri.getAdres());
			}
		}
		
	}

	@Override
	public void getMusteries() {
		for (Musteri musteri : musteriler) {
			System.out.println(musteri.getId()+"-"+musteri.getAdi()+"-"+musteri.getAdres()+"-"+musteri.getYas());
		}
	}
}
