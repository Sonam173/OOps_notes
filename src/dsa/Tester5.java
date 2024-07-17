package dsa;
import java.util.*;

public class Tester5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);//[10, 20, 30,40,50]
		System.out.println("**********");
		List<Integer> a1= new ArrayList<Integer>();
		a1.add(null);
		System.out.println(a1);//[null]
		System.out.println("***********");
		a.addAll(a1);// adding
		System.out.println(a);//[10, 20, 30, 40, 50, null]
		a.add(0,70);
		System.out.println("------------");
		System.out.println(a);
		System.out.println("*********");
		System.out.println(a.get(1));// getting value at that index
		System.out.println("********");
		System.out.println(a);
		System.out.println("********");
		a.set(3, 100);
		System.out.println(a);
		System.out.println(a.size());//getting size 
		a.remove(0);
		System.out.println(a);
		a.removeAll(a1);// remove all element of a1 from a arraylist
		System.out.println(a);
		System.out.println(a.contains(20));
		List<Integer> b= new ArrayList<Integer>();
		b.add(90);
		b.add(12);
		
		

	}

}
