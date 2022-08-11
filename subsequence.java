class subsequence{
    public static void main(String[] arg){
      String s="abc";
      SS2(s,"");
      
      
     
    }
    public static void SS2(String s,String ans ){
        
        if(s.length() ==0){
            System.out.println(ans);
        }
        else{
        SS2(s.substring(1),ans+s.charAt(0));
        SS2(s.substring(1),ans);
        }  
        
        }
    }

