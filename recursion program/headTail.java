class headTail{
    public static void main(String[] arg){
      int ques=2;
      HT(2,"");
      
      
     
    }
    public static void HT(int ques ,String ans ){
        
        if(ques ==0){
            System.out.println(ans);
            return;
        }
        else{
        HT(ques-1,ans+"H");
        HT(ques-1,ans+"T");
        }  
        

        public Static String HT2(int ques,String ans){
            if(ques==0){
                return ans;
            }
            else{
                HT2(n-1,ans.add())
            }
        }
    }

