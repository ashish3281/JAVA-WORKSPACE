// 1
// 11
// 202
// 3003
// 40004
import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nst=1;
    int row=1;
    while(row<=n){
        if(row==1){
            System.out.print("1");
        }
        else{
            for(int cst=1;cst<=nst;cst++){
                if(cst==1||cst==nst){
                    System.out.print(row-1);
                }
                else{
                    System.out.print("0");
                }
            }
        }
        System.out.println();
        nst+=1;
        row+=1;
    }
    
    }
}