import java.util.Scanner;
class example6{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
       int ind=0;
       for(int i: arr){
           System.out.print(i+" ");
           arr[ind]=arr[ind]*10;
          ind ++;
       }
       
       System.out.println();

}
}