// *********
//  *******
//   *****
//    ***
//     *
// import java.util.Scanner;
// class pattern1{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n =5;
       
        
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//            System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//                  }
//             System.out.println();
//         }
//     }
// }
import java.util.Scanner;
class pattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =5;
        int row=1;
        int nst=2*n-1;
        int nsp=0;
        while(row<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print("  ");
                csp+=1;
            }
            int cst=1;
            while(cst<=nst){
                System.out.print("* ");
                cst+=1;
            }
            nsp+=1;
            nst-=2;
            row+=1;
            System.out.println();

            
        }
    }
}