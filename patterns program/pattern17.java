// *               * 
// * *           * * 
// * * *       * * * 
// * * * *   * * * * 
// * * * * * * * * * 
import java.util.Scanner;

public class pattern17 {

	public static void main(String[] args) {
		
		int n = 5;
		
		int row = 1;
		int nst = 1;
		int nsp = 2*n-3;
		while(row <= n)
		{
            int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp += 1;
			}
			
			 cst=1;
             if(row==n){
                 cst=2;
             }
			while(cst <=nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			
			nsp-=2;
            nst+=1;
			
			row += 1;
			System.out.println();
		}

	}

}