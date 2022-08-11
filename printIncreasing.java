class printIncreasing{
    public static void main(String[] args){
    //PI(5);
    PI1(1,5);
    }
    public static void PI(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
            PI(n-1);
            System.out.println(n);
        }
        
    }
  public static void PI1(int i,int n){
      if(i==n){
          System.out.println(n);
      }
      else{
          System.out.println(i);
          PI1(i+1,n);
      }
  }
}