package Lec11;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.size());
		al.add(1);
		al.add(2);
		al.add(2, 10);
		System.out.println(al);
		
		System.out.println(al.contains(100));
		
		System.out.println(al.get(1));
		al.set(1, 1000);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		al.remove(Integer.valueOf(1000));
		System.out.println(al);
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(30);
		al.add(60);
		al.add(50);
		al.sort(Collections.reverseOrder());
		System.out.println(al);

	}

}