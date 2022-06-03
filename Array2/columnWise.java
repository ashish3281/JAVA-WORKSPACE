
//vertical wave
import java.util.Scanner;
 class columnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
	
		
		display(arr);
		
		

	}
	public static void display(int[][] arr)
	{
		for(int j = 0; j < arr[0].length;j++)
		{
			for(int i = 0; i < arr.length;i++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}