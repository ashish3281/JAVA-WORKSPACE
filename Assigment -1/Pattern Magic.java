
import java.util.*;
public class Main {
    public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int row=1;
    int nst=n;
    int nsp=-1;
    while(row<=(2*n-1)){
        int cst=1;
        while(cst<=nst){
            System.out.print("*");
            cst+=1;
        }
        int csp=1;
        while(csp<=nsp){
            System.out.print(" ");
            csp+=1;
        }
        cst=1;
        if(row==1||row==2*n-1){
            cst=2;
        
        }
        while(cst<=nst){
            System.out.print("*");
            cst+=1;
        }
        if(row<n){
            nst-=1;
            nsp+=2;
        }
        else{
            nst+=1;
            nsp-=2;
        }
        row+=1;
        System.out.println();
    }
    }
}