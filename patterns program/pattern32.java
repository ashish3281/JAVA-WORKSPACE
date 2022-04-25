//         1 
//       2 0 2 
//     3 0 0 0 3 
//   4 0 0 0 0 0 4 
// 5 0 0 0 0 0 0 0 5
import java.util.Scanner;
class pattern32{
    public static void main(String[] arg){
        int n=5;
        int row=1;
        int nsp=n-1;
        int nst=1;
        int val=1;
        while(row<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print("  ");
                csp+=1;
            }
            int cst=1;
            int cval=val;
            while(cst<=nst){
                if(cst==1 ||cst==nst){
                System.out.print(cval+" ");
                }
                else{
                    System.out.print("0 ");
                }
               cst+=1;
            }
            nst+=2;
            nsp-=1;
            row+=1;
            val+=1;
            System.out.println();
        }
    }
}