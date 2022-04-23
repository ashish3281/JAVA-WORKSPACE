// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
import java.util.Scanner;
class pattern13{
    public static void main(String[] args){
        int n=5;
        int row=1;
        int nst=n;
        
        while(row<=n){
            int cst=1;
            while(cst<=nst){
                System.out.print("* ");
                cst+=1;
            }
            
            row+=1;
            
    System.out.println();
        }
    }
}
