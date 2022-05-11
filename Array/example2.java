import java.util.Scanner;
class example2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        arr[1]=100;
        int brr[];
        brr=new int[5];
        brr[1]=10;
        System.out.println(brr[1]);
       brr=arr;
       System.out.println(brr[1]);
       System.out.println(arr[1]);

      
    }
}