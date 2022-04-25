 

import java.util.Scanner;
class pattern22{
    public static void main(String[] args){
        int n=10;
        int row=1;
        int nst=1;
        int nsp=n-1;
        int value=n;
        while(row<=n){
            int csp=1;
            while(csp<=nsp){
               System.out.print("  ");
                csp+=1;
            }
            int cst=1;
            int cval=value;
            while(cst<=nst){
                 System.out.print(cval +" ");
                if(cst<nst/2+1){
                   
                    cval+=1;
                }
                else if(cst==nst/2+1){
                    
                }
                else{
                 
                    cval-=1;
                }
                cst+=1;
                
            }
            
            row +=1;
            nsp -=1;
            nst +=2;
            value-=1;
            System.out.println();

        }
        
    }
}