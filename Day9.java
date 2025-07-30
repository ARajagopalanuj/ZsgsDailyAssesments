/*1. Program to check if person is eligible to vote or not.
int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.
*/
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class Eligble{
	
	public static void main(String[] args){
	

	int[] arr = {2, 5, 1, 4, 0, 7};
	try{
	int quotient = arr[1] / arr[4];
	System.out.println("Quotient: "+ quotient);
	}catch(Exception e){
	System.out.println(e.getMessage());
	}
	System.out.println("Programs executes succesfully");
}
}


/*
2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.*/

class Division{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	try{
	System.out.println("Enter the first num");
	String s1=scan.nextLine();
	System.out.println("Enter the second num");
	String s2=scan.nextLine();

	System.out.println("Enter your lucky number");
	int n=scan.nextInt();
	int num1=Integer.parseInt(s1);
	int num2=Integer.parseInt(s2);
	
	int result=num1/num2;

	System.out.println("Answer"+result);

	}catch(InputMismatchException e){
		System.out.println("InputMismatchException "+e.getMessage());
	}catch(NumberFormatException e){
		System.out.println("NumberFormatException "+e.getMessage());
	}catch(ArithmeticException e){
		System.out.println("ArithmeticException "+e.getMessage());
	}catch(Exception e){
		System.out.println("Exception "+e.getMessage());
	}finally{
	scan.close();
	System.out.println("Scanner class is close using finally");
	}

	System.out.println("Program executes succesfully");

	}
}


/*3. Write a program to illustrate how to throw a ClassNotFoundException.*/

class NotFound extends Division{

	public static void main(String[] args){
	
	try{
	Scanner scan=new Scanner(System.in);
	System.out.println(Class.forName("Division"));
	System.out.println(Class.forName("Scanner"));
	System.out.println(Class.forName("Gopal"));
	}catch(Exception e){
	System.out.println("Class not found: "+e.getMessage());
	}

	}
}

/*4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.*/

class ValidNumber{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the string convert to number");
	String s=scan.nextLine();
	try{
	int num=Integer.parseInt(s);
	System.out.println("num*10:  "+num*10);
	}catch(NumberFormatException e){
	System.out.println(e.getMessage());
	}finally{
	scan.close();
	System.out.println("Scanner is close using finally");
	}
	System.out.println("Executes succesfully");


	}
}

/*5. Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. Show this with output.*/

class EnsureFinally{

	public static void main(String[] args){
		
	System.out.println(print());

	}

	public static String print(){
	try{
		return "gopal";
	}catch(Exception e){
	}finally{
	System.out.println("Finally executes succesfully");
	}
	return "udhaya";	
	}
}

/*‌
6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.*/

class ATM{

	public static void main(String[] args){
		
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the pin: ");
	
	try{

	String str=scan.nextLine();
	
	if(str.charAt(0)=='0'){
		throw new Exception("First letter is zero");
	}

	if(str.length()<4){
		throw new Exception("length is too low   not valid");
	}

	if(str.length()>4){
		throw new Exception("length is too high not valid");
	}
	for(int i=0;i<str.length();i++){
	if(str.charAt(i)>47&&str.charAt(i)<57){
	continue;
	}
		throw new Exception("its not numberic");
	
	}
		System.out.println("Your Atm pin validating......");
	}catch(Exception e){
		System.out.println("pin has not validate: "+e.getMessage());
	}
	
	}
}

/*‌
7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.*/

class MethodCheck{

	public static void main(String[] args){
	
	try{
		System.out.println("method 1: "+ method1());

	}catch(Exception e){
	System.out.println("Error throws"+e.getMessage());
	}
	System.out.println("Program EXecutes Succesfully");		

	}

	public static int  method1() throws Exception{

	 return method2();

	}
	
	public static int method2() throws Exception{

	 return method3();

	}

	public static int method3() throws Exception{

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int King=scan.nextInt();

	 return King;

	}
}

/*8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.*/

class Auth{

	public static void main(String[] args){


	String username="Raja";
	String password="**********@2002";
	Scanner scan=new Scanner(System.in);
	
	try{
	System.out.println("Enter the user name");
		String userName=scan.nextLine();
		if(!username.equals(userName)){
		 	throw new Exception("User name is wrong");
		}
	System.out.println("Enter the password");
		String passWord=scan.nextLine();

		if(!password.equals(passWord)){
			throw new Exception("Password is incorrect");
		}
	System.out.println("Authentication Succesfully");
	}
	catch(Exception e){
	System.out.println("Something error: "+e.getMessage());
	}

	System.out.println("Program Executes Succesfully");
	}
}

/*9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.*/

class GetFile{

	public static void main(String[] args){
	try{
	
	FileReader freader=new FileReader("C:/Users/This Pc/Documents/Assignment/raja.txt");		
	int readingData=freader.read();

	System.out.println("File Rading Successfully");

	}catch(FileNotFoundException  e){

	System.out.println("Something happens: "+ e.getMessage());

	}catch(IOException e){

		System.out.println("IO Exception:  "+e.getMessage());

	}

	}
}

/*10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.*/

class EligibleForVote{

	public static void main(String[] args)throws Exception{
	
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter your age: ");
	int age=scan.nextInt();

	if(age<18){
		throw new Exception("not Eligible....");
	}else{
		System.out.println("put your vote....
	}

	}
}


	
	


	
	





	