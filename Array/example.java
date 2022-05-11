import java.util.Scanner;
class example{
    public static void main(String[] args){
    int[] arr={2,1,3,4,5,6,7};
    int key=6;
    search(arr,key);

}
}
   static void search(int[] arr,int key){
    for(int i=0;i<arr.length;i++){
        if(key==i){
            System.out.println(arr[i]);
        }
        else{
            System.out.println("element not present");
        }
    }
    
}