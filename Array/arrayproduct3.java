
import java.util.Arrays;

public class arrayproduct3 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		APES3(arr);

	}
	
	
	
	public static void APES3(int[] arr)
	{
		int[] lp = new int[arr.length];
//		int[] rp = new int[arr.length];
//		int[] ans = new int[arr.length]; 
		
		int p = 1;
		for(int i = 0; i < arr.length;i++)
		{
			lp[i] = p;
			p *= arr[i];
		}
		p = 1;
		for(int j = arr.length-1; j >= 0; j--)
		{
			lp[j] = lp[j]*p;
			p *= arr[j];
		}
		
//		for(int i = 0; i < arr.length;i++)
//		{
//			ans[i] = lp[i]*rp[i];
//		}
		
		System.out.println(Arrays.toString(lp));
//		System.out.println(Arrays.toString(rp));
//		System.out.println(Arrays.toString(ans));
	}

}