import java.util.Scanner;
class zero_one{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                     System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
          
            }
            System.out.println();
        }
       
    }
}