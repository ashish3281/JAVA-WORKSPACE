//         1 
//       1 1 1 
//     1 1 1 1 1 
//   1 1 1 1 1 1 1 
// 1 1 1 1 1 1 1 1 1 
import java.util.Scanner;

public class pattern18 {

	public static void main(String[] args) {
		
		int n = 5;
		
		int row = 1;
		int nst = 1;
		int nsp = n-1;
        int val=1;
		while(row <= n)
		{
            
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp += 1;
			}
			
			 int cst=1;
             int cval=val;
			while(cst <=nst)
			{
				System.out.print(cval+" ");
				cst += 1;
			}
			
			nsp-=1;
            nst+=2;
			
			row += 1;
			System.out.println();
		}

	}

}