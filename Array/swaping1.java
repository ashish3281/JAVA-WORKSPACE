import java.util.Scanner;
class swaping1{
    public static void main(String[] args){
        int arr []={1,2,3,4,5};
       
        System.out.println(arr[0]+" "+arr[1]);
        swap(0,1);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void swap(int a,int b){
        int t=a;
        a=b;
        b=t;
    }
}