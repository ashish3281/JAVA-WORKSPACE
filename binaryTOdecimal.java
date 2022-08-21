import java.util.Scanner;
class binaryTOdecimal{
    static int method(int n){
        int ans=0;
        int x=1;
        while(n>0){
            int y=n%10;
            ans+=x*y;
            x*=2;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=111001;
        System.out.println(method(n));
    }
}