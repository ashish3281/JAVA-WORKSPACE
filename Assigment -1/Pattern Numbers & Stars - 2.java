// 1******
// 12*****
// 123****
// 1234***
// 12345**
// 123456*
// 1234567
import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int i,j;
         for(i=1;i<=n;i++){
             for(j=1;j<=i;j++){
                  System.out.print(j);
             }
                 for(j=1;j<=n-i;j++){
                     System.out.print("*");
                 }
                 System.out.println();
                
             }
         }
     }
    