//           1  
//         2 3 4 
//       5 6 7 8 9 
//    10 11 12 13 14 15 16 
// 17 18 19 20 21 22 23 24 25  
import java.util.Scanner;

public class pattern25 {

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
				System.out.print(" \t");
				csp += 1;
			}
			
			 int cst=1;
             int cval=val;
			while(cst <=nst)
			{
				System.out.print(cval+"\t");
				cst += 1;
                cval+=1;
			}
			
			nsp-=1;
            nst+=2;
			val=cval;
			row += 1;
			System.out.println();
		}

	}

}