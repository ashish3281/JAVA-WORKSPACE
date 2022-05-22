import java.util.Scanner;
class search{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,8,7,9};
        System.out.println(search(arr,5));
    }
    public static int search(int[] arr,int key){
        int ind=0;
        for(int i:arr){
            if(i==key){
                return ind;
            }
            ind+=1;
        }
        return -1;
    }
}