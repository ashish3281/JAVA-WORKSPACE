import java.util.Scanner;

class largest {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>=b && a>=c ){
            System.out.print(a);
        }
        else if(b>=a && b>=c){
            System.out.print(b);
        }
        else{
             System.out.print(c);
        }
       

    }
}