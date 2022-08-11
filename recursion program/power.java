// class power{
//     public static void main(String[] args){
// System.out.println(pow(2,4));
//     }
//     public static int pow(int n,int b){
//         if (b==0){
//             return 1;
//         }
//         else{
//             return n*pow(n,b-1);
//         }
//     }
    
// }

class power{
    public static void main(String[] args){
System.out.println(pow(2,4,1));
    }
    public static int pow(int n,int b,int ans){
        if (b==0){
            return ans;
        }
        else{
            return pow(n,b-1,ans*n);
        }
    }
    
}