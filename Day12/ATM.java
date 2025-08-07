/*Use Threads to implement the ATM machine, where create thread to check the PIN number, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt*/

import java.util.Scanner;
class ATM{

	int PIN=1234;
	Boolean isPin=false;
	double balance;
	ATM(double balance){
	this.balance=balance;
	}

	public synchronized void pinCheck(int num){
	if(PIN==num){
	isPin=true;
	} 
	}

	public synchronized void cashWithdraw(double amount){
	if(isPin){
	if(balance>amount){
	balance=balance-amount;
	System.out.println("collect the cash\n\n\nBalance: "+balance);
	}else{
	System.out.println("Insufficient balance");
	}
	}else{
	System.out.println("Incorrect password");
	}
	}

	public synchronized void checkAmount(){
	if(isPin){
	System.out.println("Balance: "+balance);
	}else{
	System.out.println("Incorrect password");
	}
	}

	public synchronized void printReceipt(){
	if(isPin){
	System.out.println("Print your Receipt");
	}else{
	System.out.println("Incorrect Password");
	}
	}
}

class Main{

	public static void main(String[] args)throws InterruptedException{
	
	Scanner scan=new Scanner(System.in);
	
	
	ATM atm=new ATM(500000.00);

	boolean check=true;
	while(check){
	System.out.println("Welcome to our ATM \n\n\nwithdraw amount enter 1\n\n\ncheck Bank Balance enter 2 \n\n\nEnter e to exit... ");
	int num=scan.nextInt();
	if(num==1||num==2){
	System.out.println("Enter the pin");
	int pinNum=scan.nextInt();
	Thread pin=new Thread(()->atm.pinCheck(pinNum));
	pin.start();
	pin.join();
	}
	
	
	
	
	switch(num){

	case 1:
	System.out.println("Enter Amount");
	double amount=scan.nextDouble();

	Thread cwt=new Thread(()->atm.cashWithdraw(amount));
	cwt.start();
	cwt.join();
	Thread prt=new Thread(()->atm.printReceipt());
	prt.start();
	prt.join();
	break;

	case 2:

	
	Thread cbt=new Thread(()->atm.checkAmount());
	cbt.start();
	cbt.join();
	Thread pt=new Thread(()->atm.printReceipt());
	pt.join();
	pt.join();
	break;

	case 3:
	
	check=false;
	System.out.println("Thanks for using our atm ");
	break;
	
	default:
		System.out.println("Enter the correct choice");
		break;	


	}
	}
	
	}
}

	

	
	