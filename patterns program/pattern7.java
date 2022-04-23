// * * * * *
// * * * * 
// * * *
// * *
// *
import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		int row = 1;
		int nst = n;
		
		while(row<=n) {
			
			//Work
			
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			
			//Updation
			nst -= 1;
			row += 1;
			System.out.println();
		}

	}

}