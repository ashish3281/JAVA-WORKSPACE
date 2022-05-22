
 class square_root {

	public static void main(String[] args) {
		
		int n = 1000;
		System.out.println(sqrt(n));

	}
	
	public static int sqrt(int n)
	{
		int si = 1;
		int ei = n;
		int ans = 0;
		
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(! isItPossible(mid, n))
			{
				ei = mid-1;
			}
			else
			{
				ans = mid;
				si = mid + 1;
			}
		}
		return ans;
	}
	public static boolean isItPossible(int mid,int n)
	{
		return mid*mid <= n;
	}

}