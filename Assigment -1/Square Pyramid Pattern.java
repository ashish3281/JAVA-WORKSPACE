// 1 
// 1 4 
// 1 4 9 
// 1 4 9 16 
// 1 4 9 16 25 
import java.util.*;
public class Main {
    public static void main (String args[]) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int row=1;
    int nst=1;
    int val=1;
    while(row<=n){
        int cst=1;
        int cval=val;
        while(cst<=nst){
            System.out.print(cval+" ");
            cst+=1;
            cval+=2*cst-1;
        }
        nst+=1;
        row+=1;
        System.out.println();
    }
    }
}