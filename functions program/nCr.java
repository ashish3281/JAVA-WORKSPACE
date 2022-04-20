import java.util.Scanner;
class nCr{
    static int fact(int num){
        int factorial=1;
        
        for(int i=2;i<=num;i++){
            factorial=factorial*i;
            
            
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int r=sc.nextInt();
        int ans=fact(num)/(fact(r)*fact(num-r));
       System.out.print(ans);
    }
}