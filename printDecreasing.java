class printDecreasing{
    public static void main(String[] args){
    
    Pd(5);
    }
    public static void Pd(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
            
            System.out.println(n);
            Pd(n-1);
        }
        
    }
}