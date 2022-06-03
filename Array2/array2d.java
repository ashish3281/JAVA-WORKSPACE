package Lec12;

public class Arrays2D_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = new int[3][4];
//		int[][] arr = new int[3][];
//		for(int i = 0; i <arr.length;i++)
//			arr[i] = new int[i+2];
		
//		System.out.println(arr);
//		System.out.println(arr[0]);
		
//		arr[0][1] = 1;
//		arr[1][0] = 1;
//		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		display(arr);
		
		

	}
	public static void display(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
				
		}
	}

}