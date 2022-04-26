import java.util.Scanner;
class decimalTOoctal{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int x=1;
        int n=100;
        
        while(n!=0){
            int rem=n%8;
            ans=ans+x*rem;
            x*=10;
            n/=8;
       

        } 
        System.out.print(ans);
}
}