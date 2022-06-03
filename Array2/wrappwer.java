 import java.util.ArrayList;
class wrappwer{
    public static void main(String[] arg){

     int [] arr1={9,0,9,3,7};
     int [] arr2={9,8,1,7};
     ArrayList<Integer> ans = new ArrayList<Integer>();
     int i=arr1.length-1;
     int j=arr2.length-1;
     int c=0;
     while(i>=0||j>=0){
         int sum=c;
         if(i>=0){
             sum+=arr1[i];
             i--;
         }
         if(j>=0){
          sum+=arr2[j];
          j--;
         }
         c=sum/10;
         ans.add(0,sum%10);
     }
     if(c==1){
         //ans.add(c);
         ans.add(0,c);
     }
     //Collections.reverse(ans);
     System.out.println(ans);
       
       

    }
}