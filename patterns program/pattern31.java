//         * 
//       *   * 
//     *       * 
//   *           * 
//     *       * 
//       *   * 
//         * 

import java.util.Scanner;
class pattern31{
    public static void main(String[] args){
        int n=7;
        int row=1;
        int nst=1;
        int nsp=4;
        while(row<=n){
            int csp=1;
            while(csp<=nsp){
               System.out.print("  ");
                csp+=1;
            }
            int cst=1;
            while(cst<=nst){
                if(cst==1 || cst==nst){
                System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
                cst+=1;
            }
            if(row<n/2+1){
            nsp -=1;
            nst +=2;
            }
            else{
                nsp+=1;
                nst-=2;
            }
            
            row +=1;
            
            System.out.println();

        }
        
    }
}