

import java.util.ArrayList;
import java.util.Collections;
 class digonalTraversal {

	public static void main(String[] args) {
	
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		DT(arr);

	}
	
	public static void DT(int[][] arr)
	{
		int m = arr.length;
		int n = arr[0].length;
		int i = 0,j = 0;
		for(int k = 0; k < m+n-1; k++)
		{
			if(k < m)
			{
				i = m-k-1;
				j= 0;
			}
			else
			{
				i = 0;
				j = k-m+1;
			}
			ArrayList<Integer> al = new ArrayList<Integer>();
			while(i < m && j < n)
			{
//				System.out.print(arr[i][j]+ " ");
				al.add(arr[i][j]);
				j++;
				i++;
			}
			if(k %2 == 0)
			{
				System.out.println(al);
			}
			else
			{
				Collections.reverse(al);
				System.out.println(al);
			}
		}
	}

}