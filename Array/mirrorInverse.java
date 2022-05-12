import java.util.Scanner;
import java.util.Arrays;
class mirrorInverse{
    public static void main(String[] args){
        int [] arr={2,3,1,4,0};
        int[] inv=new int[arr.length];
        for(int i=0;i<arr.length;i++){
        
       inv[arr[i]]=i;}
    
   
        
       System.out.println(Arrays.toString(inv));
       boolean f=true;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=inv[i]){
               f=false;
               break;
           }
       }
       System.out.println(f);
    }
}


   