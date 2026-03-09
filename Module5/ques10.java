class a extends Exception{
    a(String s){
        super(s);
    }
}

class ques10{
    static void f(int x) throws a{
        if(x<0) throw new a("negative");
        else System.out.println(x);
    }

    public static void main(String[] b){
        try{
            f(-1);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}