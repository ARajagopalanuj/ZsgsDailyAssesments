/*5. Design a class named`BankAccount that uses the concept of encapsulation. The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.*/

class BankAccount{
private String accountNumber;
private String accountHolderName;
private double balance;

	public void setAccountNumber(String accountNumber){
	this.accountNumber=accountNumber;
	}

	public String getAccountNumber(){
	return accountNumber;
	}

	public void setAccountHolderName(String accountHolderName){
	this.accountHolderName=accountHolderName;
	}

	public String getAccountHolderName(){
	return accountHolderName;
	}

	public void setBalance(double balance){
	this.balance=balance;
	}

	public double getBalance(){
	return balance;
	}

	void deposit(double balance){
	this.balance+=balance;
	System.out.println("Balance: "+this.balance);
	}

	void withdraw(double balance){
	this.balance-=balance;
	System.out.println("Balance: "+this.balance);
	}

	
	public static void main(String[] args){
	BankAccount bankAccount=new BankAccount();
	
	bankAccount.setAccountNumber("56869563594");
	bankAccount.setAccountHolderName("Rajagopalan A");
	bankAccount.setBalance(50000.00);

	
	bankAccount.withdraw(20000.00);
	bankAccount.deposit(50000.00);
	}
}













