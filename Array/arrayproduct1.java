
//array product except itself
import java.util.Arrays;

public class arrayProduct1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		APES1(arr);

	}
    public static void APES1(int[] arr)
	{
		int[] ans = new int[arr.length];
		for(int i = 0; i < arr.length; i++ )
		{
			int p = 1;
			for(int j = 0; j < arr.length; j++)
			{
				if(i!=j)
				{
					p *= arr[j];
				}
			}
			ans[i] = p;
		}
		System.out.println(Arrays.toString(ans));
	}
}
// arr={1,2,3,4,5}
// first=2*3*4*5=120
// second=1*3*4*5=60
// third=1*2*4*5=40
// fourth=1*2*3*5=30
// fifth=1*2*3*4=24