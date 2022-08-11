//principle of mathametical induction
class pmi{
    public static void main(String[] args){
     pd(5);
    }
    public static void pd(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
        System.out.println(n);
        pd(n-1); 
    }
}
}