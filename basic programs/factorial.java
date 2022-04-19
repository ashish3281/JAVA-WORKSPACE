import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int factorial=1;
        for(int i=n;i<=1;i--){
            factorial=factorial*i; 
              
        }
     System.out.println(factorial);

    }
}