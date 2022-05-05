// 5                   5 
// 5 4               4 5 
// 5 4 3           3 4 5 
// 5 4 3 2       2 3 4 5 
// 5 4 3 2 1   1 2 3 4 5 
// 5 4 3 2 1 0 1 2 3 4 5 
// 5 4 3 2 1   1 2 3 4 5 
// 5 4 3 2       2 3 4 5 
// 5 4 3           3 4 5 
// 5 4               4 5 
// 5                   5 
import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int nst=1;
       int nsp=2*n-1;
       int val=n;
       int row=1;
       while(row<=2*n+1){
           int cst=1;
           int cval=val;
           while(cst<=nst){
               System.out.print(cval+" ");
               cst+=1;
               cval-=1;
           }
           int csp=1;
           while(csp<=nsp){
               System.out.print("  ");
               csp+=1;
           }
           cst=1;
           
           if(row==n+1){
               cst=2;
               cval++;
           }
           cval++;
           while(cst<=nst){
               System.out.print(cval+" ");
               cst+=1;
               cval+=1;
           }
           if(row<n+1){
               nst+=1;
               nsp-=2;
           }
           else{
               nst-=1;
               nsp+=2;
           }
           row+=1;
           System.out.println();
       }
   }
    }
