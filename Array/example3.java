//display an array
import java.util.Scanner;
class example3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        arr[1]=1;
       display(arr);

      
    }
    public static void display(int[] arr){
        arr[2]=2;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
// //display an array
// firstly import java.util.Arrays;
// System.out.println(Arrays.toString(arr));//for print array