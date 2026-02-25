import java.util.*;
class positive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("take a number:");
        int n=sc.nextInt();
        if(n>0) {
        System.out.println("positive");
        }
        else if(n<0){
        System.out.println("negative");
        }
        else{
        System.out.println("Zero");
        }
    }
}