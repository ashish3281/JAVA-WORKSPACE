import java.util.Scanner;
class question2{
    public static void main(String[] arg){
        byte b=(byte)673;
        System.out.println(b);//-95
        short s=10;
        int i=10;
        long l=10l;
        float f=10.01f;
        double d=10.1;
        b=(byte)s;
        s=b;//bite can be easily converted into short so we can not use type casting
    
        i=s;
        char ch='a';
        System.out.println(ch);
        ch=(char)(ch+1);
       // ch=ch+1;// can not covert from int to char
        System.out.println(ch);
    }
}