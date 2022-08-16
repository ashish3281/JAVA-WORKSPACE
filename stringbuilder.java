class stringbuilder{
    public static void main(String[] args){
      StringBuilder st = new StringBuilder("hello");
      StringBuilder st1=new StringBuilder("hello");
      StringBuilder st3=st;
      System.out.println(st);
      System.out.println(st==st1);
      System.out.println(st==st3);
      st.append("Bye!!");
      System.out.println(st3);
      System.out.println(st1);
      st1.insert(2,"RRR");
      System.out.println(st1);
      st1.setCharAt(2,'Y');
      System.out.println(st1);
      st1.deleteCharAt(2);
      System.out.println(st1);
      st1.delete(2,5);
      System.out.println(st1);//end will not be included
      String s=st1.substring(0,3);
      System.out.println(s);//substring result is always in string.
      StringBuilder ns=new StringBuilder();
      long start=System.currentTimeMillis();
      for(int i=1;i<=1000000;i++){
          ns.append("a");
      }
      long end=System.currentTimeMillis();
      System.out.println(end-start);
    }
}