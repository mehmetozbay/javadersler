package test3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Person{

	String ad;
	int yas;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "Person [ad=" + ad + ", yas=" + yas + "]";
	}
	
	
		
	}
class MyComparem implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.yas>p2.yas?1:-1;
	}
}

public class PreQueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Person p1 =new Person("Ali",15);
	 Person p2 =new Person("Can", 20);
	 Person p3=new Person("Hasan", 35);
	 
	 Queue<Person> personQue=new PriorityQueue<>(new MyComparem());
	 personQue.add(p1);
	 personQue.add(p2);
	 personQue.add(p3);
	 while (!personQue.isEmpty()) {
		System.out.println(personQue.poll());
		
	}
	 

	}

}
