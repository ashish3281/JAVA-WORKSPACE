import java.util.Scanner;

class neon {
    public static void main(String[] args) {
    //neon number 9=>9*9=81=>8+1=9
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int square=a*a;
        int sum=0;
        while(square>0){
            int lastdigit=square%10;
            sum=sum+lastdigit;
            square=square/10;
        }
        if(sum==a){
            System.out.print("it is a neon number");
        }
        else
        System.out.print("it is not a neon number");

    }
}