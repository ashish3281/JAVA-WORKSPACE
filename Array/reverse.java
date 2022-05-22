import java.util.Scanner;
class reverse{
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5};
        
       reverse(arr);
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
         //System.out.println(Arrays.toString(arr));
     }
    }
    public static void reverse(int [] arr){
        int si=0;
        int ei=arr.length-1;
        while(si<ei){
            int t=arr[si];
            arr[si]=arr[ei];
            arr[ei]=t;
            si+=1;
            ei-=1;
        }
        
    }
}
//public static void reverse (int [] arr,int si,int ei)
//for a specific no of element you want to swap