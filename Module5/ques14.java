class a{
}

class b{
}

class ques14{
    public static void main(String[] x){
        a o1=new a();
        b o2=new b();

        Thread t1=new Thread(){
            public void run(){
                synchronized(o1){
                    try{Thread.sleep(100);}catch(Exception e){}
                    synchronized(o2){}
                }
            }
        };

        Thread t2=new Thread(){
            public void run(){
                synchronized(o2){
                    try{Thread.sleep(100);}catch(Exception e){}
                    synchronized(o1){}
                }
            }
        };

        t1.start();
        t2.start();
    }
}