        //                  1
        //                2 3 2
        //              3 4 5 4 3
        //                2 3 2
        //                  1
                         import java.util.*;
                         public class Main {
                             public static void main(String args[]) {
                              Scanner sc=new Scanner(System.in);
                              int n=sc.nextInt();
                              int row=1;
                              int nst=1;
                              int nsp=n;
                              int val=1;
                              while(row<=2*n-1){
                               int csp=1;
                               while(csp<nsp){
                                   System.out.print("\t");
                                   csp+=1;
                               }
                               int cst=1;
                               int cval=val;
                               while(cst<=nst){
                                   System.out.print(cval+"\t");
                                   cst+=1;
                                   if(cst<=nst/2+1){
                                       cval+=1;
                                   }
                                   else{cval-=1;}
                                   
                                  
                               }
                               if(row<n){
                                   nsp-=1;
                                   nst+=2;
                                   
                               }
                               else{
                                   nsp+=1;
                                   nst-=2;
                             
                               } 
                               row+=1;
                               if(row<=n){
                                   val++;
                               }
                               else{
                                   val--;
                               }
                              
                               
                               System.out.println();
                              }
                             }
                         }