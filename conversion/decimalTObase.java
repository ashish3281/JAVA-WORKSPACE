import java.util.Scanner;
class decimalTObase{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int x=1;
        int n=57;
        int base=2;
        
        while(n!=0){
            int rem=n%base;
            ans=ans+x*rem;
            x*=10;
           n/=base;
        }
        System.out.print(ans);

        }
}