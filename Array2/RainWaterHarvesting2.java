

import java.util.Arrays;

class RainWaterHarvesting2 {

   public static void main(String[] args) {
       
       int[] arr = {0, 2, 1, 3, 0, 1, 2, 1, 2, 1};
       rt(arr);

   }
   
  
   public static void rt(int[] arr)
   {
       int[] lmax = new int[arr.length];
       int[] rmax = new int[arr.length];
       
       lmax[0] = arr[0];
       for(int i = 1;i<arr.length;i++)
       {
           lmax[i] = Math.max(arr[i],lmax[i-1]);
       }
       System.out.println(Arrays.toString(lmax));
       rmax[arr.length-1] = arr[arr.length-1];
       for(int i = arr.length-2; i >= 0; i--)
       {
           rmax[i] = Math.max(arr[i],rmax[i+1]);
       }
       System.out.println(Arrays.toString(rmax));
       
       int ans = 0;
       for(int i = 0; i < arr.length; i++)
       {
           ans += Math.min(lmax[i], rmax[i]) - arr[i];
       }
       System.out.println(ans);
       
   }

}