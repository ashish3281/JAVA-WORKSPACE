// class fibonaci{
//     public static void main(String[] args){
//       System.out.println(fib(8));
//     }
//     public static int fib(int n){
//       if(n==0){
//           return 0;
//       }
//       else if(n==1){
//           return 1;
//       }
//       else{
//           return fib(n-1)+fib(n-2);
//       }
//     }
// }

class fibonaci{
  public static void main(String[] args){
    System.out.println(fib(8,0,1));
  }
  public static int fib(int n,int ans1,int ans2){
    if(n==0){
        return ans1;
    }
    // else if(n==1){
    //     return ans2;
    // }
    else{
        return fib(n-1,ans2,ans1+ans2);
    }
  }
}