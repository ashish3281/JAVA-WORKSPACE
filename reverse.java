//reverse word
import java.util.Arrays;
class reverse{
    public static void main(String[] args){
        System.out.println(rw("The Sky is Blue"));
        System.out.println(rw2("The  Sky is  Blue"));
    }
        public static String rw(String st){
    
        String st1="";
        int i=st.lastIndexOf(' ');
        while(i!=-1){
            st1+=st.substring(i+1)+" ";
            st=st.substring(0,i);
            i=st.lastIndexOf(' ');
        }
        return st1+st;

    }
    public static String rw2(String st){
        String [] sa=st.split(" ");
        String ns="";
        System.out.println(Arrays.toString(sa));
        for(int i=sa.length-1;i>=0;i--)
       // if(sa[i].length()!=0)
           ns+=sa[i]+" ";
        return ns;
    }
}
