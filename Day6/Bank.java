/*1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.]*/

class Bank{

private int transactionId;
private String payerName;
private String payeeName;
private double amount;
private String paymentMethod;
private String transactionStatus;

	public void setTransactionId(int transactionId){
	this.transactionId=transactionId;
	}
	public int getTransactionId(){
	return transactionId;
	}

	public void setPayerName(String payerName){
	this.payerName=payerName;
	}

	public String getPayerName(){
	return payerName;
	}

	public void setPayeeName(String payeeName){
	this.payeeName=payeeName;	
	}

	public String getPayeeName(){
	return payeeName;	
	}

	public void setAmount(double amount){
	this.amount=amount;
	}

	public double getAmount(){
	return amount;
	}

	public void setPaymentMethod(String paymentMethod){
	this.paymentMethod=paymentMethod;
	}

	public String getPaymentMethod(){
	return paymentMethod;
	}

	public void setTransactionStatus(String transactionStatus){
	this.transactionStatus=transactionStatus;	
	}

	public String getTransactionStatus(){
	return transactionStatus;	
	}

	public static void main(String[] args){
	Bank bank=new Bank();
	bank.setTransactionId(1001);
	bank.setPayerName("Raja");
	bank.setPayeeName("Seeni");
	bank.setAmount(100000.00);
	bank.setPaymentMethod("Google Pay");
	bank.setTransactionStatus("Success");

	System.out.println("transcation ID: "+bank.getTransactionId());

	System.out.println("Payer name: " + bank.getPayerName());

	System.out.println("Payee name: " + bank.getPayeeName());

	System.out.println("Amount :" + bank.getAmount());

	System.out.println("Payment Method: " + bank.getPaymentMethod());

	System.out.println("Transaction Status: " + bank.getTransactionStatus());
	

	}
}




