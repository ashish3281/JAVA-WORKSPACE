import java.util.Scanner;
class triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                     System.out.print("*");
                }
           
            }
            System.out.println();
            
        }
       
    }
}