// 1 2 3 4 5
// 1 2 3 4 * 
// 1 2 3 * * *
// 1 2 * * * * *
// 1 * * * * * * *
import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int i,j;
         for(i=0;i<n;i++){
             for(j=1;j<=n-i;j++){
                 System.out.print(j+" ");
             }
             for(j=0;j<2*i-1;j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
        
            
     }
    }
