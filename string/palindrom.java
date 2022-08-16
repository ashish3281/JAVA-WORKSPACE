class palindrom{
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
  
}