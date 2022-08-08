

import java.util.ArrayList;
import java.util.Collections;

public class arraylistDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(12);
		al.add(93);
		al.add(54);
		al.add(35);
		
		al.add(1,100);
		System.out.println(al.size());
		System.out.println(al);
		
		al.set(0, 10);
		System.out.println(al);
		
		al.remove(al.size()-1);
		System.out.println(al);
		System.out.println(al.get(0));
		al.sort(Collections.reverseOrder());
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

	}

}