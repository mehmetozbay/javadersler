package ders17;

public class Ornek_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myArray[]=new int[10];
		String myArray2[]=new String[15];
		myArray[0]=5;
		myArray[0]=6;
		myArray[3]=15;
       myArray[1]=10;
       
       
       System.out.println(myArray[0]);
       System.out.println(myArray[2]);
       System.out.println(myArray[3]);
       myArray2[0]="Ali";
       myArray2[4]="Hasan";
		
		int yourArray[]= {3,5,7,8};
       yourArray[2]=4;
//       System.out.println(yourArray[4]);
       int boyut=yourArray.length;
       System.out.println(boyut);
       System.out.println(myArray2.length);
       System.out.println(myArray.length);
       
	}

}
