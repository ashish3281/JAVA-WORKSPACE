import java.util.Arrays;
class binary_search{
    public static void main(String[] arg){
        int[] arr={1,2,3,4,5,6,7,8,9};
      
        System.out.println(binarySearch(arr ,7));
       
    }
         static int binarySearch(int[] arr,int key){
        int si=0;
        int ei=arr.length-1;
      
        while(si<=ei){
              int mid=(si+ei)/2;
         if(arr[mid]>key){
             ei=mid-1;
         }
         else if(arr[mid]<key){
             si=mid+1;
         }
         else{
             return mid;
         }
        }
        return -1;
        // System.out.println(arr[mid]);
    }

}
//use this formula also for binary search
//mid=si+(ei-si)/2