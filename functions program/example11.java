import java.util.Scanner;
class example11{
    public static void main(String[] arg){
        System.out.println("hi");
      int a=10;
      int b=39;
      int c=add(a,b);
      System.out.println(c);
      sub(200,100);
      System.out.println("bye");
    }
    public static void sub(int a,int b){
    
        
        int c=a-b;
        System.out.println(c);
    }
    public static int add(int a,int b){
    
        
        int c=a+b;
        sub(a,b);
    
        return c;
    }

}