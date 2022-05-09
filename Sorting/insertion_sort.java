import java.util.Arrays;
class insertion_sort{
    public static void main(String[] args){

    }
    public static void insert(int[] arr,int i){
        int t=arr[i];
        int j=i-1;
        while(j>0){
            if(arr[j]>t){
                arr[j+1]=arr[i];
            }
            else{
               
                break;
            }
            j--;
            arr[j+1]=t;
        }
    }
    public static void IS(int[] arr){
        for(int i=1;i<arr.length;i++){
            insert(arr,i);
        }
    }
}