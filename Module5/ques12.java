class a extends Thread{
    public void run(){
        System.out.println("thread");
    }
}

class b implements Runnable{
    public void run(){
        System.out.println("runnable");
    }
}

class ques12{
    public static void main(String[] a){
        a t1=new a();
        Thread t2=new Thread(new b());
        t1.start();
        t2.start();
    }
}