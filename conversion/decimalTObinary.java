import java.util.Scanner;
class decimalTObinary{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int x=1;
        int n=57;
        //int base=2;
        //int n=sc.nextInt();
        while(n!=0){
            int rem=n%2;//int rem=n%base;
            ans=ans+x*rem;
            x*=10;
            n/=2;//n/=base;
        }
        System.out.print(ans);

        }
}