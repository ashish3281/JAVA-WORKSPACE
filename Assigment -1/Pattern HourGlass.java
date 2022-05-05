// 5 4 3 2 1 0 1 2 3 4 5
// 4 3 2 1 0 1 2 3 4 
//   3 2 1 0 1 2 3 
//     2 1 0 1 2 
//       1 0 1 
//         0 
//       1 0 1 
//     2 1 0 1 2 
//   3 2 1 0 1 2 3 
// 4 3 2 1 0 1 2 3 4 
// 5 4 3 2 1 0 1 2 3 4 5
import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int row=1;
     int nst=2*n+1;
     int nsp=0;
     int val=n;
     while(row<=2*n+1){
      int csp=1;
      while(csp<=nsp){
          System.out.print("  ");
          csp+=1;
      }   
      int cst=1;
      int cval=val;
      while(cst<=nst){
          System.out.print(cval+" ");
          if(cst<nst/2+1){
              cval-=1;

          }
          else{
              cval+=1;
          }
          cst+=1;
      }
      if(row<n+1){
          nsp+=1;
          nst-=2;
          val-=1;
      }
      else{
          nsp-=1;
          nst+=2;
          val+=1;
      }
      System.out.println();
      row+=1;
     }
    }
}