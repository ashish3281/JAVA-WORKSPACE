import java.util.ArrayList;
import java.util.Arrays;

public class arrDisplay {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		display(arr,0);

	}
	public static void display(int[] arr,int i)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			System.out.println(arr[i]);
			display(arr, i+1);
		}
	}
	public static void display2(int[] arr,int i)
	{
		if(i == -1)
		{
			return;
		}
		else
		{
			display2(arr, i-1);
			System.out.println(arr[i]);
		}
	}
}