import java.util.Arrays;
class bubble_sort{
    public static void main(String[] args){
        int [] arr={5,3,1,2,4};
        for(int j=0;j<arr.length-1;j++){
            int s=0;
        for(int i=0;i<arr.length-1-j;i++){
            if(arr[i+1]<arr[i]){
                s++;
                int t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
            }
        }
        if(s==0){
        return;
        }
    }
        System.out.println(Arrays.toString(arr));
    }
}