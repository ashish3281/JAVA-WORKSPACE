import java.util.Scanner;
class countDigit{
    static int method(int n){
     
       int count=0;
        while(n!=0){
            count ++;
           
            n/=10;
        }
        return count;
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=10132;
        System.out.println(method(n));
    }
}