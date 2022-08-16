import java .util.Scanner;
class basic
{
    public static void main(String[] args) {
        String s1="hello!!! I am CB";
        String s2="hello!!! I am CB";
        String s3=new String("hello");
        String s4=new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        // Scanner sc=new Scanner(System.in);
        // String st=sc.next();
        // System.out.println(st);
        System.out.println(s1.charAt(0));
        System.out.println(s1.substring(2,5));
        System.out.println(s1.substring(5));
        System.out.println(s1.startsWith("hello"));
        System.out.println(s1.endsWith("CBF"));
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.indexOf("lll"));
        System.out.println(s1.lastIndexOf("ll"));
        System.out.println(s1.replace('l','r'));
        System.out.println(s1);//not change in original string
        System.out.println(s1.concat("Bye"));
        String st="";
        long start=System.currentTimeMillis();
         for(int i=1; i<+100000;i++){
             st=st+"a";
         }
         long end=System.currentTimeMillis();
         System.out.println(end-start);

    }
}