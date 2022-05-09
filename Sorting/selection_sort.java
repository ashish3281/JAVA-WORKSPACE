import java.util.Scanner;
import java.util.Arrays;
class selection_sort{
    public static void main(String[] args){
       int [] arr={5,3,1,2,4};
       ss(arr);
       System.out.println(Arrays.toString(arr));
    }
     public static int minA(int[] arr,int i){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[min]>arr[j]){
                min=j;
            }
            
        }
       return min;
        
    }
    public static void ss(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int m=minA(arr,i);
            int t=arr[i];
            arr[i]=arr[m];
            arr[m]=t;
        }
    }
}