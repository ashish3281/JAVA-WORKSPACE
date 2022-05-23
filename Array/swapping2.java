import java.util.Scanner;
class swapping2{
    public static void main(String[] args){
        int arr []={1,2,3,4,5};
        
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr,0,1);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void swap(int [] arr, int a,int b){
        int t=arr[0];
        arr[0]=arr[1];
        arr[1]=t;
    }
}