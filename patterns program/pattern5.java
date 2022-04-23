//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * *   
   import java.util.Scanner;

 class pattern5{

	public static void main(String[] args) {
	
		
		int n = 5;
		
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		while(row <= n)
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
			
			nst += 1;
			nsp -= 1;
			row += 1;
			System.out.println();
		}

	}

}