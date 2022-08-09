// class factorial{
//     public static void main(String[] args){
// System.out.println(fact(5));
//     }
//     public static int fact(int n){
//         if (n==0){
//             return 1;
//         }
//         else{
//             return n*fact(n-1);
//         }
//     }
    
// }

class factorial {
    public static void main(String[] args){
System.out.println(factTail(5,1));
    }
    public static int factTail(int n,int ans){
        if (n==0){
            return ans;
        }
        else{
            return factTail(n-1,ans*n);
        }
    }
    
}