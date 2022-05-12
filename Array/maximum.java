import java.util.Scanner;
class maximum{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,8,7,9};
        maxA(arr);
    }
    public static void maxA(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }
        }
        System.out.println(max);
        
    }
}