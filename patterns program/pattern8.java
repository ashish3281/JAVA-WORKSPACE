//        * 
//      * ! * 
//    * ! * ! * 
//  * ! * ! * ! * 
// * ! * ! * ! * ! * 
import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		
		int n = 5;
		
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		
		while(row<=n) {
			
			//Work
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp+=1;
			}
			
			int cst = 1;
			while(cst <= nst)
			{
				if(cst %2 == 1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("! ");
				}
				cst += 1;
			}
			
			//Updation
			nst += 2;
			nsp -= 1;
			row += 1;
			System.out.println();
		}


	}

}