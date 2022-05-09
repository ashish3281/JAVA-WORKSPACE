// 1
// 2 2
// 3 0 3
// 4 0 0 4
// 5 0 0 0 5
import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner sc =new Scanner(System.in);
   int n =sc.nextInt();
   int row=1;
   int nst=1;
   int val=1;
   while(row<=n){
       int cst=1;
       int cval=val;
       while(cst<=nst){
           if(cst==1||cst==nst){
            System.out.print(cval+"\t");
           }
           else{
               System.out.print("0\t");
           }
           cst+=1;
       }
       row+=1;
       nst+=1;
       val+=1;
       System.out.println();
   }
    }
}