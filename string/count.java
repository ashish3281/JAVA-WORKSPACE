//count substring
class count{
    public static void main(String[] args){
       
        System.out.println(countSS("nitin"));

    }
    public static boolean isPalindrome(String st){
        int si=0;
        int ei=st.length()-1;
        while(si<ei){
            if(st.charAt(si)!=st.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public static int countSS(String st){
        int count=0;
        for(int i=0;i<st.length();i++){
            for(int j=i;j<st.length();j++){
                if(isPalindrome(st.substring(i,j+1))){
                    count++;
                }
                
            }
        }
        return count;
    }
}