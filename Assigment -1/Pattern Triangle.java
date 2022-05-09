                //        1 
                //      2 3 2
                //    3 4 5 4 3
                //  4 5 6 7 6 5 4
                import java.util.*;
                public class Main {
                    public static void main(String args[]) {
                         Scanner sc=new Scanner(System.in);
                         int n=sc.nextInt();
                         int row=1;
                         int nst=1;
                         int nsp=n-1;
                         int val=1;
                         while(row<=n){
                             int csp=1;
                             while(csp<=nsp){
                                 System.out.print("\t");
                                 csp+=1;
                             }
                             int cst=1;
                             int cval=val;
                             while(cst<=nst){
                                 System.out.print(cval+"\t");
                                 if(cst<nst/2+1){
                                     cval+=1;
                                 }
                                 else{
                                     cval-=1;
                                 }
                                 cst+=1;
                             }
                             nsp-=1;
                             nst+=2;
                             val+=1;
                             row+=1;
                             System.out.println();
                         }
                    }
                
                }