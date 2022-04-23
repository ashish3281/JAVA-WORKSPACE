// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
// import java.util.Scanner;
// class pattern2{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n =5;
//        int row=1;
//        int nst=1;
//        while(row<=2*n-1){
//            int cst=1;
//            while(cst<=nst){
//             System.out.print("*");
//             cst+=1;

//            }
//           
//            if(row<n){
//                nst+=1;
//            }
//            else{
//                nst-=1;
//            }
//row += 1;
//            System.out.println();
//         }
        
        
//     }
// }
import java.util.Scanner;
class pattern2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
           System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){

           System.out.print("*");
            }
            System.out.println();
        }
       
    }
}