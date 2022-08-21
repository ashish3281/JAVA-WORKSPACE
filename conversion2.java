import java.util.Scanner;
 class conversion2 {
 
    public static void main(String[] args)
    {
   
        long a = 3;
        byte b = 2;
        double c = 2.0;
 
       
        double final_datatype = (a + b + c);//easily add because double is greater than long and byte
 
       // int final_datatype=(a+b+c);// error int is smaller than long and double
       // so we use
       //int final_datatype=(int)(a+b+c); //7
        System.out.print(final_datatype);
    }
}