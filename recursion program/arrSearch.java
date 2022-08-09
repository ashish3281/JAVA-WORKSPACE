
import java.util.ArrayList;
import java.util.Arrays;

public class arrSearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};

		System.out.println(search(arr, 0, 3));

	}
	

	
	public static int search(int[] arr,int i,int ele)
	{
		if(i == arr.length)
		{
			return -1;
		}
		else
		{
			if(arr[i] == ele)
			{
				return i;
			}
			else {
				return search(arr, i+1, ele);
			}
		}
	}
}