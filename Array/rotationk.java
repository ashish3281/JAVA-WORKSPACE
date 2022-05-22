import java.util.Scanner;
import java.util.Arrays;
class rotationk{
    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        
       
        rotationK(arr,103);
        System.out.println(Arrays.toString(arr));
    }
    static void rotation1(int[] arr){
        int t=arr[arr.length-1];
       for(int i=arr.length-1;i>=1;i--){
           arr[i]=arr[i-1];
           

       }
       arr[0]=t;
       
    }
     
       

    static void rotationK(int[] arr ,int k){
        k = k%arr.length;
       for(int i=0;i<k;i++){
           rotation1(arr);
           

       }
    
       
    }
}
//it is optional to use thi k = k%arr.length;
//because k value is 103 so for loop will work for 103 time 
//we observe that after a certain interval value is repeat so we use this equation to find actually how many times this loop will work
// 1 2 3 4 5 actual arr
// 5 1 2 3 4 first rotation
// 4 5 1 2 3 second rotation
// 3 4 5 1 2 third rotation
// 2 3 4 5 1fourth rotation
// 1 2 3 4 5 fifth rotation
// after fifth rotation we get the same output as array.
