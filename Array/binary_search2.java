import java.util.Arrays;
class binary_search2{
    public static void main(String[] arg){
        int[] arr={1,2,3,4,5,6,7,8,9};
      binarySearch2(arr ,7);
        
       
    }
    public static void binarySearch2(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
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
				System.out.println(mid);
				break;
			}
		}
		if(si>ei)
		{
			System.out.println("-1");
		}
	}

}