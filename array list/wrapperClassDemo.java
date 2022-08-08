public class wrapperClassDemo {

	public static void main(String[] args) {
		
		int a = 127;
		Integer b = new Integer(a);
		Integer c = Integer.valueOf(a);
		Integer d = a;
		Integer e = a;
		
		System.out.println(c==d);
		int f = e.intValue();
		int g = e;
		System.out.println(f);

	}

}