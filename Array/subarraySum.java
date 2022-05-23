
class subarraySum{
    public static void main(String[] args){
        
        int[] arr={1,2,3,4};
       
        printSUM(arr);
    }
        
    
    public static void printSUM(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                //System.out.println(i+" "+j);
            int sum=0;
                for(int k=i;k<=j;k++){
                   
                    sum+=arr[k];
                    
                }System.out.print(sum);
            System.out.println();
            }
        }
        
    }
}