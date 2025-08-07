/*8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).*/


import java.util.ArrayList;
class Account{

	int accountNumber;	
	String holderName;
	Double balance;
	double intrest;

	Account(int accountNumber,String holderName,double balance){
	this.accountNumber=accountNumber;	
	this.holderName=holderName;	
	this.balance=balance;
	this.intrest=(balance*5)/100;
	}
}

class Bank{
	public static void main(String[] args){

	ArrayList<Account>list=new ArrayList<>();

	Account account=new Account(1001,"raja",50000.00);
	Account account1=new Account(1002,"udhaya",40000.00);
	Account account2=new Account(1003,"jana",100000.00);

	list.add(account); 
	list.add(account1); 
	list.add(account2);

	

	for(Account a:list){
	System.out.println("Account  number: "+a.accountNumber);
	System.out.println("Account holder name:"+ a.holderName);
	System.out.println("Account balance: "+a.balance);
	System.out.println("After add intrest: "+(a.intrest+a.balance));
	}
	
	
	Integer n=10;
	int n1=n;
	System.out.println("-----------------------------------");
	System.out.println("after manual boxing "+n1);
	Integer num=n1;
	}
	
	
	
	
}
	
	








	

	
	
	