import java.util.Scanner;
class example5{
    static void checkAge(int age){
        if(age>18){
            System.out.println("apply for driving");
        }
        else{
            System.out.println(" not apply for driving");
        }
    }
    public static void main(String[] args){
      checkAge(28);
       
    }
}