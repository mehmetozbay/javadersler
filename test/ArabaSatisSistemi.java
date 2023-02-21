package test;

public class ArabaSatisSistemi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Araba araba=new Araba();
       
       Araba araba1=new Araba("mavi");
		
       Araba araba2=new Araba(12000,"Otomatik","Kirmizi",4);
       
       System.out.println(araba2.fiyat);
       
       System.out.println(araba1.renk);
       
       
	}

}
