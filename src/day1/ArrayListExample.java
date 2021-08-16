package day1;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {

	
	public static void main(String[] args) {

		// Array
		int a[]=new int[5];  
		a[0]=10;  
		a[1]=20;  
		a[2]=70;  
		System.out.println(a[1]);
		
		//ArrayList
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		System.out.println("arraylist: " + al);
		System.out.println(al.get(1));
		al.remove("Ravi");
		System.out.println("arraylist: " + al);
		
		
		//LinkedList
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("James");
		ll.add("Serena");
		ll.add("Swati");
		ll.add("Junaid");
		
		System.out.println("linkedlist: " + ll);
	}

}
