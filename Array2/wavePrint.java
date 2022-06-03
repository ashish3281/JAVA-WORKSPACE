package Lec12;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		wp(arr);

	}
	
	public static void wp(int[][] arr)
	{
		for(int j = 0 ; j < arr[0].length;j++)
		{
			if(j%2 == 0)
			{
				for(int i = 0;i <arr.length; i++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int i = arr.length-1; i >= 0; i--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}

}