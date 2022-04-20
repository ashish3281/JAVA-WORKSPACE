import java.util.Scanner;
class factorial{
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
        int ans=fact(num);
       System.out.print(ans);
    }
}