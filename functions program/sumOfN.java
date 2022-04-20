import java.util.Scanner;
class sumOfN{
    static int sum(int num){
        int ans=0;
        
        for(int i=1;i<=num;i++){
            ans=ans+i;;
            
            
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        
       System.out.print(sum(num));
    }
}