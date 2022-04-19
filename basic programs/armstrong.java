import java.util.Scanner;

class armstrong {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
      
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            n=n/10;
        }
        if(sum==n){
            System.out.print("it is a armstrong number");
        }
        else
        System.out.print("it is not a armstrong number");

    }
}