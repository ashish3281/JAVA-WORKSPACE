//display an array
// import java.util.Scanner;
// class example4{
//     public static Scanner sc=new Scanner(System.in);
//     public static int[] takeInput(int n){
//             int[] arr=new int [n];
//             for(int i=0;i<n;i++){
//                 arr[i]=sc.nextInt();
//             }
//             return arr;
//         }
       
      
//     }
import java.util.*;
class example4{
    public static void main(String[] args){
   int n;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   int[] arr=new int[n];
   for(int i=0;i<n;i++)
   {
       arr[i]=sc.nextInt();
   }
   System.out.println(Arrays.toString(arr));
}
}
