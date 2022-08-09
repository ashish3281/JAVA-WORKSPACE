package Lec25;

import java.util.ArrayList;
import java.util.Arrays;

public class ListRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
//		display2(arr, arr.length-1);
//		System.out.println(search(arr, 0, 3));
//		System.out.println(lastOccr(arr, 0, 3, -1));
//		AllOcc(arr, 0, 3);
//		ArrayList<Integer> ans = new ArrayList<Integer>();
//		AllOcc1(arr, 0, 3, ans);
//		ans = AllOcc2(arr, 0, 3);
//		System.out.println(ans);
		int[] ans = AllOcc3(arr, 0, 3, 0);
		System.out.println(Arrays.toString(ans));

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
	
	public static int lastOccr(int[] arr,int i,int ele,int ans)
	{
		if(i == arr.length)
		{
			return ans;
		}
		else
		{
			if(arr[i] == ele)
			{
				return lastOccr(arr, i+1, ele, i);
			}
			else {
				return lastOccr(arr, i+1, ele,ans);
			}
		}
	}
	
	public static void AllOcc(int[] arr,int i,int ele)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			if(arr[i] == ele)
			{
				System.out.println(i);
			}
			AllOcc(arr, i+1, ele);
		}
	}
	public static void AllOcc1(int[] arr,int i,int ele,ArrayList<Integer> ans)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			if(arr[i] == ele)
			{
//				System.out.println(i);
				ans.add(i);
			}
			AllOcc1(arr, i+1, ele,ans);
		}
	}

	public static ArrayList<Integer> AllOcc2(int[] arr,int i,int ele)
	{
		if(i == arr.length)
		{
			return new ArrayList<Integer>();
		}
		else
		{
			ArrayList<Integer> ans = AllOcc2(arr, i+1, ele);
			if(arr[i] == ele)
			{
//				System.out.println(i);
				ans.add(0,i);
			}
			return ans;
		}
	}
	
	public static int[] AllOcc3(int[] arr,int i,int ele,int count)
	{
		if(i == arr.length)
		{
			return new int[count];
		}
		else
		{
			if(arr[i] == ele)
			{
				count += 1;
			}
			int[] ans = AllOcc3(arr, i+1, ele, count);
			if(arr[i] == ele)
			{
				ans[count-1] = i;
			}
			return ans;
		}
	}
}
