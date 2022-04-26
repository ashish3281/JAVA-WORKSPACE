import java.util.Scanner;
class octalTOdecimal{
    static int method(int n){
        int ans=0;
        int x=1;
    
        while(n>0){
            int y=n%10;
            ans+=x*y;
            x*=8;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println(method(n));
    }
}