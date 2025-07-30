/*
Day-7 Assignment Questions:
1. All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.*/

abstract class RBI{
Customer c;
Account a;

double intrestRate=4.0;
double minimumAccountBalance=1000.00;
double withDrawLimit=50000.00;
/*RBI(Customer c,Account a){
this.c=c;
this.a=a;
}*/

abstract void displayDetails();/*{
c.displayDetails();
a.displayDetails();
}*/
double getIntrestRate(){
	
return intrestRate;
}

double getMinimumAccountBalance(){
return minimumAccountBalance;
}

double getWithDrawLimit(){
return withDrawLimit;
}

}

class SBI extends RBI{
private double amount;
private double intrestRate=4.5;

private double withDrawLimit=50000.00;
SBI(Customer c,Account a, double amount){
super.c=c;
super.a=a;
this.amount=amount;
}
void displayDetails(){
c.displayDetails();
a.displayDetails();
}

void getAmount(double rupees){
if(rupees<amount&&rupees<withDrawLimit&&amount-rupees>=super.minimumAccountBalance){
System.out.println("with draw succesfully");
}else{
System.out.println("withdraw failure");
}

}

double getIntrestRate(){
	
return intrestRate;
}


double getWithDrawLimit(){
return withDrawLimit;
}
} 

class ICICI extends RBI{
private double intrestRate=5.0;
private double minimumAccountBalance=500.00;
private double withDrawLimit=10000.00;
private double amount;

ICICI(Customer c,Account a, double amount){
super.c=c;
super.a=a;
this.amount=amount;
}
void displayDetails(){
c.displayDetails();
a.displayDetails();
}


void getAmount(double rupees){
if(rupees<amount&&rupees<withDrawLimit&&amount-rupees>=super.minimumAccountBalance){
System.out.println("with draw succesfully");
}else{
System.out.println("withdraw failure");
}

}


double getIntrestRate(){
	
return intrestRate;
}
ICICI(Customer c,Account a){
super.c=c;
super.a=a;
}


double getMinimumAccountBalance(){
return minimumAccountBalance;
}

double getWithDrawLimit(){
return withDrawLimit;
}
}

class Customer{

private String name;
private int age;
private String address;

Customer(String name,int age,String address){
this.name=name;
this.age=age;
this.address=address;
}

void displayDetails(){
System.out.println("The customer name: "+name);
System.out.println("The customer Age: "+age);
System.out.println("The customer Address: " +address);
}
}
class Account{

private String accountType;
private String branchName;
private String accountNumber;

Account(String accountType,String branchName,String accountNumber){
this.accountType=accountType;
this.branchName=branchName;
this.accountNumber=accountNumber;
}

void displayDetails(){
System.out.println("Account type: "+accountType);
System.out.println("Branch Name: "+branchName);
System.out.println("AccountNumber: "+accountNumber);
}
}

class BankSystem{

public static void main(String[] args){

Customer customer=new Customer("raja",25,"aaaddddhhhh");
Account account=new Account("Tirunelveli","Palayankottai","nnnnnnnn00000536");

SBI sbi =new SBI(customer,account,200000.00);

sbi.displayDetails();
sbi.getAmount(10000.00);

System.out.println();
System.out.println("----------------------------------------------------------------------------------------------------");
System.out.println();


ICICI icici=new ICICI(customer,account,300000.00);
icici.displayDetails();
icici.getAmount(10000.00);
}
}

