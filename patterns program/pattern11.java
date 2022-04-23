
//         * * * * * 
//       * * * * 
//     * * * 
//   * * 
// * 
//   * * 
//     * * * 
//       * * * * 
//         * * * * * 
import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		
		int n = 5;
		
		int row = 1;
		int nst = n;
		int nsp = n-1;
		while(row <= 2*n-1)
		{
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp += 1;
			}
			
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			
			if(row < n)
			{
				nst -= 1;
				nsp -= 1;
			}
			else
			{
				nsp += 1;
				nst += 1;
			}
			
			row += 1;
			System.out.println();
		}

	}

}