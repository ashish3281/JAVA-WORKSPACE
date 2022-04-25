import java.util.Scanner;
class pattern30{
    public static void main(String[] arg){
        int n=5;
        int row=1;
        int nst=1;
        int nsp=n-4;
        while(row<=2*n-1){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp+=1;
            }
            int cst=1;
            while(cst<=nst){
                if(cst==0 || cst<2*row-2){
                System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
                cst+=1;
            }
             nst+=1;
            nsp-=1;
            row+=1;  
            System.out.println();
        }
    }
}