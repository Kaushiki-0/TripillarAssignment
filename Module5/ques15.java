class a extends Thread{
    public void run(){
        System.out.println("running");
    }
}

class ques15{
    public static void main(String[] a){
        a t=new a();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
    }
}