
// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * * 
import java.util.Scanner;
 class pattern4{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n =5;
        int row=1;
         int nst=n;

        int nsp=n-1;
        while(row<=n){
           
            int cst=1;
 while(cst<=nst){
    if(row==1 ||row==n ||cst==1||cst==n)
//      if(cst==row ||cst+ row==n+1)
//    *       * 
//      *   *   
//        *     
//      *   *   
//    *       * 
//      {

          System.out.print("* ");
     }
    else{
        System.out.print("  ");
    }
     cst+=1;
 }
            
          
          row+=1;
            System.out.println();
         }
        
        
    }
 }
