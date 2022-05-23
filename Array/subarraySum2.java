
class subarraySum2{
    public static void main(String[] args){
        
        int[] arr={1,-2,3,14,-5,6,-7,-8,9};
       
        maxSUM(arr);
    }
        
    
    public static void maxSUM(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
            sum+=arr[j];
            if(max<sum){
                max=sum;
            }
            
            }
            
        }
        System.out.println(max);
        
    }
}