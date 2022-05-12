import java.util.Scanner;
import java.util.Arrays;
class example8{
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5};
        
       rotatek2(arr,3);
    System.out.println(Arrays.toString(arr));
     
    }
    public static void reverse(int [] arr,int si,int ei){
  
        while(si<ei){
            int t=arr[si];
            arr[si]=arr[ei];
            arr[ei]=t;
            si+=1;
            ei-=1;
        }
        
    }
    public static void rotatek2(int [] arr,int k){
        k=k%arr.length;
        if(k<0){
             k+=arr.length;
        }
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
}
