class sumOfN{
    public static void main(String[] args){
    System.out.println(SUM(10));
    
    }
    public static int SUM(int n){
    if(n==1){
        return 1;
    }
    else
    {
       return SUM(n-1)+n;
    }

}
}