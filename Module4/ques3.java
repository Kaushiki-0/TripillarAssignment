class ques3{
    public static void main(String[] a){
        String s="hello";
        s=s+" world";
        StringBuilder b=new StringBuilder("hello");
        b.append(" world");
        StringBuffer f=new StringBuffer("hello");
        f.append(" world");
        System.out.println(s);
        System.out.println(b);
        System.out.println(f);
    }
}