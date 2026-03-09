class ques11{
    static void f(int a){
        if(a<18) throw new ArithmeticException("not allowed");
        else System.out.println("allowed");
    }

    public static void main(String[] b){
        f(16);
    }
}