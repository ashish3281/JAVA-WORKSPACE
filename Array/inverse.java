import java.util.Scanner;
import java.util.Arrays;
class inverse{
    public static void main(String[] args){
        int [] arr={2,3,1,4,0};
        int[] inv=new int[arr.length];
        for(int i=0;i<arr.length;i++){
        
       inv[arr[i]]=i;}
    
   
        
       System.out.println(Arrays.toString(inv));
    }
}
//  0 1 2 3 4
// [2 3 1 4 0]

//  0 1 2 3 4
// [4 2 0 1 3]
// in arr at zero position 2value so we inverse it at two position 0 value

   