import java.util.Scanner;
class swapping4{
    public static void main(String[] args){
        int arr []={1,2,3,4,5};
        int arr2 []={5,4,3,2,1};
        System.out.println(arr[0]+" "+arr2[0]);
        swap(arr ,arr2);
        System.out.println(arr[0]+" "+arr2[0]);
    }
    public static void swap( int arr[],int arr2 []){
        int t=arr[0];
        arr[0]=arr2[0];
        arr2[0]=t;
    }
}