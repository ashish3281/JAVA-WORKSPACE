// * * * * * * * * * 
// * * * *   * * * * 
// * * *       * * * 
// * *           * * 
// *               * 
import java.util.Scanner;

public class pattern23 {

	public static void main(String[] args) {
		
		int n = 5;
		
		int row = 1;
		
		int nst = n;
		int nsp = -1;
		
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
			
			cst = 1;
			if(row == 1 )
			{
				cst = 2;
			}
			while(cst <= nst)
			{
                
				System.out.print("* ");
				cst += 1;
			}
			
			nsp+=2;
            nst-=1;
			row += 1;
			System.out.println();
		}
	}
}