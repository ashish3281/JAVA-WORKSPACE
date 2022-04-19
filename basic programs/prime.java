import java.util.Scanner;

class prime {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
     
        int a = in.nextInt();
        int flag=1;
        for(int i=2;i<=a;i++){
            if(a%i==0){
               flag=2;
            }
        }
        if(flag==1){
 System.out.print("prime number");
        }
        else{
            System.out.print(" not a prime number");
        }
       

    }
}