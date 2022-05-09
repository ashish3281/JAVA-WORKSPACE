// 1 2 3 4 5 
// 2 2 3 4 5 
// 3 3 3 4 5 
// 4 4 4 4 5 
// 5 5 5 5 5
import java.util.*;
public class Main {
    public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int nst=n;
        int val=1;
        while(row<=n){
            int cst=1;
            int cval=val;
            while(cst<=nst){
                if(cst<=row){
                System.out.print(cval+" ");
                }
                else{
                
                cval+=1;
                System.out.print(cval+" ");
                }
                cst+=1;
            }
     row+=1;
     val+=1;
     System.out.println();
        }
       
    }
    }
