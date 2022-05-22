//only one rotation
import java.util.Scanner;
import java.util.Arrays;
class example7{
    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        
        rotation1(arr);
        System.out.println(Arrays.toString(arr));
        
        
    }
     static void rotation1(int[] arr){
         int t=arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
            

        }
        arr[0]=t;
        
     }
     

}