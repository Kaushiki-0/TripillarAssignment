class ques9{
    public static void main(String[] a){
        try{
            int x=10;
            int y=0;
            int z=x/y;
            System.out.println(z);
        }catch(Exception e){
            System.out.println("error");
        }finally{
            System.out.println("done");
        }
    }
}