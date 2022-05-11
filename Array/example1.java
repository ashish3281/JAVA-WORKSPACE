import java.util.Scanner;
class example1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println(arr);//give an address
        System.out.println(arr.length);//lengt of an array
        //default value of an array element is 0
        System.out.println(arr[2]);//0
        arr[1]=100;
      
    }
}
//another way to declare an array
//int[] arr=null;
//arr=new int[5];