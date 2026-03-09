class ques7{
    public void finalize(){
        System.out.println("gc");
    }
    public static void main(String[] a){
        ques7 o=new ques7();
        o=null;
        System.gc();
    }
}