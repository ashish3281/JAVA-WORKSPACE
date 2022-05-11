// upper bound binary search
// eg arr= 1,1,2,2,2,2,3,3,4,5,6,6,6,7,7
// if you find the two is present in this array or not
// if two is present the find the lower bound index 
// for example in this array at index fifth two is present last this is upper bound
// here we take a variable for storing ans of binary search
// let assume that key element is not present in this return -1
// so here we take ans as -1
// and we search for right hand side for this we do si=mid+1
// if another two is present print ans
import java.util.Arrays;
class binary_search4{
    public static void main(String[] arg){
        int[] arr={1,1,2,2,2,2,3,3,4,5,6,6,6,7,7};
      
        System.out.println(upperBound(arr ,2));
       
    }
       public static int upperBound(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		int ans  = -1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else if(arr[mid] < ele)
			{
				si = mid+1;
			}
			else
			{
				ans = mid;
				si = mid+1;
			}
		}
		return ans;
	}

}