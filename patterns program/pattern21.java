// 1 
// 2 * 2 
// 3 * 3 * 3 
// 4 * 4 * 4 * 4 
// 5 * 5 * 5 * 5 * 5 
// 4 * 4 * 4 * 4 
// 3 * 3 * 3 
// 2 * 2 
// 1 
import java.util.Scanner;
class pattern21{
    public static void main(String[] args){
        int n=5;
        int row=1;
        int nst=1;
        int val=1;
        while(row<=2*n-1){
            int cst=1;
            int cval=val;
            while(cst<=nst){
                if(cst%2==0){
                    System.out.print("* ");
                }
                else{
                System.out.print(cval + " ");
                }
                cst+=1;
            }
            
            if(row<n){
                nst+=2;
            val+=1;
            }
            else{
                nst-=2;
                val-=1;
            }
            row+=1;
            System.out.println();
        }
    }
}