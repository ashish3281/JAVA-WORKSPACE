import java.util.Scanner;
class example13{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     
      allarmstrong( n);
      
    
    

    }
    public static  int count(int n){
    int count=0;
    while(n>0){
        count++;
        n=n/10;
       
    }
     return count;
    }
    public static boolean isArmsyrong(int n){
        int x=count(n);
        int sum=0;
        int originaln=n;
        while(n!=0){
           int lastdigit=n%10;
           sum=sum+(int)Math.pow(lastdigit,x);
           n=n/10;
        }
        return sum==originaln;
        
        
    }
    public static void allarmstrong(int n){
        for(int i=1;i<=n;i++){
            if(isArmsyrong(i)){
                System.out.println(i);
            }
        }
    }
   

}