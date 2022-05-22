import java.util.Scanner;
import java.util.Arrays;
class rotationMinus{
    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        
    
        
        minusRotationK(arr,-2);
        System.out.println(Arrays.toString(arr));
    }
     static void rotation1(int[] arr){
         int t=arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
            

        }
        arr[0]=t;
        
     }
     static void minusRotationK(int[] arr ,int k){
        k = k%arr.length;
        if(k<0){
            k+=arr.length;
        }
       for(int i=0;i<k;i++){
           rotation1(arr);
           

       }
    
       
    }
   

}
// for five number array
// in minus rotation -1 rotate=+4 rotate
// -2 =+3
// -3 =+2
// -4= +1
// so we get a equation for this k<0   k=k+arr.length
// if we want -3 value k=-3+5==2