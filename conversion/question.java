import java.util.Scanner;
class question{
    public static void main(String[] arg){
      int minF=0;
      int maxF=100;
      int steps=20;
      for(int f=minF;f<=maxF;f+=steps){
          int c=(int)((5/9.0)*(f-32));
          System.out.println(c);
      }
    }
}
// int c=(5/9)*f-32   gives zero zero becase 5/9==0.31 somthing in int it is 0 
// so we convert 9 to float 9.0 it give some floating value 0.31 somthing but we want answer in integer
// so take type casting.
// int c=(5*(f-32))/9 this method is also correct divisible by 9 is not 0.