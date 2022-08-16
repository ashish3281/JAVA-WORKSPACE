class substring{
    public static void main(String[] args){
        SS("ashish");
        // String s1="ashish";
        // for(int i=0;i<s1.length();i++){
        // for(int j=0;j<s1.length();j++){
        //     for(int k=i;k<=j;k++){
        //         System.out.print(s1.charAt(k)+"");
        //     }
        //     System.out.println();
        // }
        // }
    }
    public static void SS(String st){
        for(int i=0;i<st.length();i++){
            for(int j=i;j<st.length();j++){
                System.out.println(st.substring(i,j+1));
            }
        }
    }
}