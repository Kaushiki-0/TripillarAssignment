import java.io.*;

class ques8{
    public static void main(String[] a){
        try{
            int x=10/0;
        }catch(Exception e){
            System.out.println("unchecked");
        }

        try{
            FileReader f=new FileReader("a.txt");
        }catch(IOException e){
            System.out.println("checked");
        }
    }
}