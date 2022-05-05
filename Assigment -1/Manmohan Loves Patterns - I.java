// 1 
// 11
// 111 
// 1001 
// 11111
// 100001
import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int row=1;
         int nst=1;
         while(row<=n){
            
         if(row%2!=0){
             for(int j=1;j<=row;j++){
             System.out.print(1);
             }
         }
         else{
             int cst=1;
             while(cst<=nst){
                 if(cst==1||cst==nst){
                     System.out.print(1);
                 }
                 else{
                     System.out.print(0);
                 }
                 cst+=1;
             }
         }
          System.out.println();
          nst+=1;
          row+=1;
         }
     
    }
}