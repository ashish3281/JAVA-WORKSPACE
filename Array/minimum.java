import java.util.Scanner;
class minimum{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,8,7,9};
        minA(arr);
    }
    public static void minA(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i:arr)
        {
            if(i<min)
            {
                min=i;
            }
        }
        System.out.println(min);
        
    }
}