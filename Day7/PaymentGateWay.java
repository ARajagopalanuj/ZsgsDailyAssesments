/*2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different methods.*/

interface PaymentMethod{
void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
 
public void pay(double amount){
System.out.println("credit card payment successfully"+ amount);
}
}
class DebitCardPayment implements PaymentMethod{
public void pay(double amount){
System.out.println("Debitcard payment succesfully"+ amount);
}
}
class UPIPayment implements PaymentMethod{
public void pay(double amount){
System.out.println("UPI payment succesfully"+ amount);
}
}

class GateWay{
public static void main(String[] args){

CreditCardPayment ccp=new CreditCardPayment();

DebitCardPayment dcp=new DebitCardPayment();

UPIPayment upi=new UPIPayment();

ccp.pay(200.00);
dcp.pay(123.00);
upi.pay(250.00); 

}
}