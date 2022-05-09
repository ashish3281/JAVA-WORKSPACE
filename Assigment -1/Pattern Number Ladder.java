// 1
// 2 3
// 4 5 6
// 7 8 9 10
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int row=1;
            int nst=1;
            int val=1;
            while(row<=n){
                int cst=1;
                int cval=val;
                while(cst<=nst){
                 System.out.print(cval+"\t");
                 cst+=1;
                 cval+=1;
                }
                System.out.println();
                row+=1;
                nst+=1;
                val=cval;
            }
        }
    }

