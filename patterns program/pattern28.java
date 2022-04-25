// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 
import java.util.Scanner;
class pattern28{
    public static void main(String[] args){
        int n=5;
        int row=1;
        int nst=n;
        int val=5;
        while(row<=n){
            int cst=1;
            int cval=val;
            while(cst<=nst){
            
                System.out.print(cval+" ");
                cval-=1;
                cst+=1;
            }
            
            row+=1;
            
    System.out.println();
        }
    }
}
