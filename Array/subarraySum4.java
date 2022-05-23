
class subarraySum4{
    public static void main(String[] args){
        
        int[] arr={1,-2,3,14,-5,6,-7,-8,9};
       
        kadanes(arr);
    }
        
    
    public static void kadanes(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){ 
            sum+=arr[i];
            if(sum>max){
                max=sum;
                
            }
            if(sum<0){
                sum=0;
            }
            
        }
        System.out.println(max);
        
    }
}