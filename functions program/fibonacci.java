import java.util.Scanner;
class fibonacci{
    static void fib(int num){
        int t1=0;
        int t2=1;
        int nextterm;
        for(int i=1;i<=num;i++){
            System.out.print(t1);
            nextterm = t1+t2;
            t1=t2;
            t2 = nextterm;
            
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       fib(num);
    }
}