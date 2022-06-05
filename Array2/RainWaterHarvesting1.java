

import java.util.Arrays;

 class RainWaterHarvesting1 {

	public static void main(String[] args) {
		
		int[] arr = {0, 2, 1, 3, 0, 1, 2, 1, 2, 1};
		rainTrap(arr);

	}
	
	public static int lmax(int[]  arr, int j)
	{
		int max = arr[j];
		for(int i = j-1; i>= 0;i--)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	public static int rmax(int[]  arr, int j)
	{
		int max = arr[j];
		for(int i = j+1; i<= arr.length-1;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	public static void rainTrap(int[] arr)
	{
		int ans = 0;
		for(int i = 0;i<arr.length;i++)
		{
			int l = lmax(arr, i);
			int r = rmax(arr, i);
			int m = Math.min(l, r);
			ans += m-arr[i];
		}
		System.out.println(ans);
	}


}