import java.util.Scanner;
class example12{
    public static void main(String[] arg){
        System.out.println("hi");
      int a=10;
      int b=39;
   
      System.out.println("glo");
      global();
      System.out.println("bye");
    }
    public static void sub(int a,int b){
    
        
        int c=a-b;
        System.out.println(c);
    }
    public static int add(int a,int b){
    
        
        int c=a+b;
    
    
        return c;
    }
    public static void global(){
        int glo=10;
        System.out.println("glo");
        //System.out.println(FunctionDemo.glo);
    }

}