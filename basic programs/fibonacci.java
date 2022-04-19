import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t1=0;
        int t2=1;
        for(int i=1;i<=n;i++){
            System.out.print(t1);
            int temp =t1+t2;
        t1=t2;
            t2=temp;
        }
        

    }
}