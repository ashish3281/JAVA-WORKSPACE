import java.util.Scanner;
class baseTOdecimal{
    static int method(int n){
        int ans=0;
        int x=1;
        int base=2;
        while(n>0){
            int y=n%10;
            ans+=x*y;
            x*=base;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int n=101;
        System.out.println(method(n));
    }
}