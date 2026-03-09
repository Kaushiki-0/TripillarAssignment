class ques6{
    static int x=0;
    static void f(){
        x++;
        System.out.println(x);
    }
    public static void main(String[] a){
        f();
        f();
        f();
    }
}