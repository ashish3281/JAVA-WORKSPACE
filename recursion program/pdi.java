//print increasing and decresing order
class pdi{
     public static void main(String[] args) {
        PDI(5);
    }
    public static void PDI(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
            System .out.println(n);
            PDI(n-1);
            System .out.println(n);
        }
    }
}