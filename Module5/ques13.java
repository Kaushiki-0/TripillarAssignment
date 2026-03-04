class a{
    int x=0;
    synchronized void f(){
        x++;
        System.out.println(x);
    }
}

class b extends Thread{
    a o;
    b(a o){
        this.o=o;
    }
    public void run(){
        o.f();
    }
}

class ques13{
    public static void main(String[] a){
        a o=new a();
        b t1=new b(o);
        b t2=new b(o);
        t1.start();
        t2.start();
    }
}