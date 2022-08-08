

import java.util.ArrayList;
import java.util.Collections;
 class sumOfTwo {

	public static void main(String[] args) {
		
		int[] arr = {9,0,9,3,7};
		int[] brr = {9,8,1,7};
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i = arr.length-1;
		int j = brr.length-1;
		
		int c = 0;
		while(i >= 0 || j >= 0)
		{
			int sum = c;
			if(i >= 0)
			{
				sum += arr[i];
				i--;
			}
			if(j >= 0)
			{
				sum += brr[j];
				j--;
			}
			c = sum/10;
			ans.add(0,sum%10);
			
		}
		if(c==1)
			ans.add(0,c);
//		Collections.reverse(ans);
		System.out.println(ans);
	}

}