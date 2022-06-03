package Lec10;

import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000;
//		Integer b = Integer.valueOf(10);
//		Integer c = new Integer(10);
		Integer b = a;
		
		int c = b;
		System.out.println(c);
		
		Integer d = b;
		System.out.println(d==b);
		b = b + 1000;
//		System.out.println(d);
//		System.out.println(b);
		System.out.println(d == b);
		
		
		ArrayList<Integer> al = new ArrayList<>();

	}

}