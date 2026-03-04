interface Payment{
    void pay();
}
class CreditCardPayment implements Payment{
    int Amount;
    CreditCardPayment(int Amount){
        this.Amount=Amount;
    }
    public void pay(){
        System.out.println("Payment is sucessful of "+Amount+" via Credit card");
    }
}
class UPIpayment implements Payment{
int Amount;
UPIpayment(int Amount){
    this.Amount=Amount;
}
public void pay(){
    System.out.println("Payment is sucessful of "+Amount+" via UPI");

}
}
class Ques2{
    public static void main(String[] args){
        CreditCardPayment s=new CreditCardPayment(10000);
        s.pay();
        UPIpayment g=new UPIpayment(20000);
        g.pay();

    }
}
