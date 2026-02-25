import java.util.*;
class Amount{
    int AccountNumber;
    int balance=1000;
    void deposit(int d){
        balance = balance + d;
    }
    void withdraw(int w){
         balance = balance - w;
    }
    int balance(){
        return this.balance;
    }
}
public class Bank{
    public static void main(String[] args){
        Amount a= new Amount();
        a.deposit(100);
        System.out.println(a.balance());
    }
}