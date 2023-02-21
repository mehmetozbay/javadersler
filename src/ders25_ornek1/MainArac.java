package ders25_ornek1;

public class MainArac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arac car=new Arac();
		car.setMarka("Opel");
		System.out.println(car.getMarka());
		car.setMarka("VW");
		System.out.println(car.getMarka());
		System.out.println(car.toString());
		car.setVitesTuru("otomatik");
		System.out.println(car.toString());
	}

}
