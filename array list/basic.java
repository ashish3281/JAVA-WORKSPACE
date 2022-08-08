//premitive to non premitive
class basic{
    public static void main(String[] args){
        int a=10;
        Integer b= Integer.valueOf(a);
        Integer c= new Integer(a);
        Integer d = a;
        System.out.println(b==d);
        System.out.println(d==a);
        int g=100;
        Integer e=g;
        System.out.println(e==g);
        int f=e.intValue();
        
        System.out.println(f);
    }
}