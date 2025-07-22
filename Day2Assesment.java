/*1. Write a program that uses if statement to find the minimum of three numbers.*/

class findMinimum{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the first number: ");

	int num1=scan.nextInt();

	System.out.println("Enter the second number: ");
 
	int num2=scan.nextInt();

	System.out.println("Enter the third number: ");

	int num3=scan.nextInt();

	if(num1<num2&&num1<num3){

		System.out.println("The minimum number is"+ num1);
		
	}else if(num2<num1&&num2<num3){

		System.out.println("The minimum number is"+ num2);

	}else{

		System.out.println("The minimum number is"+ num3);

	}
     }	
}
/*pattern1*/



class Pattern1{

     public static void main(String[] args)                   {

	int n=5;

	for(int i=0;i<n;i++){

 		for(int j=0;j<n;j++){

		if(i==j||j==n-i-1){
		System.out.print(1);
		}else{
		System.out.print(" ");
		}
		}
	System.out.println();

	}  
	
		

     }
}

/*patter 2*/
class Pattern2{

	public static void main(String[]args){
		int n=5;
	for(int i=0;i<n;i++){

 		for(int j=0;j<n;j++){

		if(i==0||i==n/2){
			
		System.out.print("R ");

		}else if(i<n/2){

		  if(j==0||j==n-1){
	          System.out.print("R ");
		  }else{
		    System.out.print("  ");
		  }
		}else{

		  if(j==0||j==i){
		   System.out.print("R ");
		}else{
		  System.out.print("  ");
		}
		}

		
		}
		System.out.println();

		}



	}
}

/*pattern3*/

class Pattern3{

	public static void main(String[]args){
		int n=3;
	int m=2*n-1;
	int i=0;
	int index=1;
	
	int space=0;

	while(i<=m){
	int j=0;

	if(i<=n){
	space=n-i;
	}else{
	space=i-n;
	}

	while(j<=n){

		if(j<=space){
		System.out.print(" ");
		}else{
		System.out.print(index++ +" ");
		}
		j++;
	}

	System.out.println();
	i++;
	
	}

     }
}

/*Pattern4*/

class Pattern4{

	public static void main(String[] args){

	int n=5;
	int i=0;

	int m=2*n-1;

	while(i<m){
	
	int h=i;
	
	int j=0;

	if(h>=n){
	h=m-i-1;
	}
	

	while(j<=h){
		

	System.out.print("w ");
	j++;

	}
	System.out.println();
	i++;
	

	}

	}
}
class Pattern5{
public static void main(String[] args){
int n=4;
int tempRow=n;

int i=0;

do{
int temp=i;
 while(n-temp-1>0){
System.out.print(" ");
temp++;
}
int j=0;
int num=1;
while(j<=i){
System.out.print(num+" ");
num=num*(i-j)/(j+1);
j++;
}
i++;
tempRow--;
System.out.println();
}while(tempRow>0);


}
}


/*pattern 6*/
class Pattern6{

public static void main(String[] args){

String s="ZOHOCORPORATIONS";
int i=0;
do{
if(i%4==0){
System.out.println();
}
System.out.print(s.charAt(i));
i++;


}while(i<s.length());
}
}

/*5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.*/

class SumOfEven{
     public static void main(String[] args){
	int n=10;
	for(int i=1;i<=n;i++){
		if(i%2==0){
			System.out.println(i+" ");
		}else{
		continue;
		}
	}	
	
     }     
}

class ConvertBinary{

     public static void main(String[] args){
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the number: ");
	int num=scan.nextInt();
	scan.close();

	System.out.println("The binary value is: "+ convertBin(num));

     }
	public static String convertBin(int input){
		
	String binaryValue="";

	while(input>0){

	int rem=input%2;

	binaryValue=rem+binaryValue;

	input/=2;

	}
	return binaryValue;
     }

}

/*Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”*/

class Grade{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the number");

		int mark=scan.nextInt();
		scan.close();

		if(mark>=85){

			System.out.println("if statement output grade: A");

		}else if(mark>=70){

			System.out.println("if statement output grade: B");

		}else if(mark>=50){

			System.out.println("if statement output grade: C");

		}else{

			System.out.println("if statement output grade: Fail");

		}


		int sum=mark/10;

		switch(sum){
			
		case 10:
			System.out.println("Switch case output grade: A");
			break;
		case 9:

			System.out.println("Switch case output grade: A");
			break;

		case 8:
			if(mark>=85){
			System.out.println("Switch case output grade: A");
			break;
			}

		case 7:
			System.out.println("Switch case output grade: B");
			break;

		case 6:

			System.out.println("Switch case output grade: C");
			break;

		case 5:
			System.out.println("Switch case output grade: C");
			break;

		default:
			System.out.println("Switch case output grade: Fail");
			break;			

		}	

	}
}

			//Day 2 Assesment -2
/*1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.*/

class AddOdd{

     public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the array size");

	int size=scan.nextInt();

	int sum=0;
	
	int[] arr=new int[size];

        for(int i=0;i<size;i++){
	
	arr[i]=scan.nextInt();
	if(arr[i]%2!=0){
	    sum+=arr[i];
	}

	}
	System.out.println("The sum of odd number is: "+ sum);
  }
}

/*2. Write a program to take in 10 values and print only those numbers which are prime.*/


class Prime{

     public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the array size");

	int size=scan.nextInt();

	int[] arr=new int[size];
	
	 for(int i=0;i<size;i++){

		arr[i]=scan.nextInt();
	}
	System.out.println("the prime numbers are");
	for(int i=0;i<size;i++){

		if(checkPrime(arr[i])){

		System.out.println(arr[i]);
	 }
	}
  }

    public static boolean checkPrime(int num){
	if(num%2==0){
	   return false;
	}

	int count=0;

	for(int i=3;i<num;i+=2){
		
	if(num%i!=0){
	 continue;
	}
 	 return false;	
	
	}
	return true;
     }

  }

/*3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.*/

class Fibonacci{

     public static void main(String[] args){

	int[] arr=new int[30];

	arr[0]=0;

	arr[1]=1;

	for(int i=2;i<30;i++){

		arr[i]=arr[i-1]+arr[i-2];

	}

	for(int i=0;i<30;i++){
		System.out.println(arr[i]+ " ");
	}
     }

}

/*4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).*/

class ArraySum{

	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	int len=scan.nextInt();

	int[] arr=new int[len];

	for(int i=0;i<len;i++){

	arr[i]=scan.nextInt();	

	}

	print(arr,len);


	}

      static void print(int[]arr, int size){

	int oneDigit=0;
	int twoDigit=0;

	for(int i=0;i<size;i++){

	
	
	if(arr[i]<=9&&arr[i]>0){
	oneDigit+=arr[i];
	}else if(arr[i]<100&&arr[i]>0){

	twoDigit+=arr[i];

	}

	}
	System.out.println("sum of one digit numbers "+oneDigit);
	System.out.println("sum of two digit numbers "+twoDigit);



      }	
}
/*5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }*/	

class ArrayCheck{

     public static void main(String[] args){

	char[]X={'m','n','o','p'};

	char[]Y={'m','n','o','p'};

	boolean val=true;

	if(X.length==Y.length){

	    for(int i=0;i<X.length;i++){
		if(X[i]==Y[i]){
		    continue;

		}else{
		    System.out.println("These arrays are not equal");
		    val=false;
		     break;
		
	    }
	}

	}else{
	    System.out.println("These arrays are not equal");
	}
	
	if(val){
	    System.out.println("These arrays are equal");
	}

     }
}

/*6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2022}*/

class BinarySearch{

	public static void main(String[] args){

	int[]year={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};

	Scanner scan=new Scanner(System.in);

	int target=scan.nextInt();
	scan.close();
	int right=year.length-1;
	int left=0;
	boolean val=true;
	
	

	while(left<=right){
		int mid=(left+right)/2;

	if(target==year[mid]){
		System.out.println("record exists");
		val=false;
		break;
	}else if(target<year[mid]){
		right=mid-1;
	}else{
	      left=mid+1;
	}
       }
	if(val){

		System.out.println("record does not exists");

	}

	

	}
}

/*7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.*/

class SortTech{

	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	int[] arr=new int[10];


	for(int i=0;i<10;i++){
		arr[i]=scan.nextInt();
	}
	
	for(int i=0;i<10;i++){

	int minIndex=i;

	for(int j=i+1;j<10;j++){

	if(arr[j]>arr[minIndex]){
		minIndex=j;
	}

		
		int temp=arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=temp;
		}
	

	}

	for(int i=0;i<10;i++){
	
	System.out.print(arr[i]+" ");

	}
}

}

/*8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.*/

class Age{

     public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	int[] arr=new int[10];

	int child=0;

	int middleAgers=0;

	int old=0;

	for(int i=0;i<10;i++){
		
		arr[i]=scan.nextInt();

	}

	for(int i=0;i<10;i++){

	if(arr[i]>60){
	
	old++;

	}else if(arr[i]<18){
		child++;
	}else{
		middleAgers++;
	}
     }
     	System.out.println("The number of childeren"+child);
	System.out.println("The number of middleAgers"+middleAgers);
	System.out.println("The number of old agers"+old);
		

   }
}

/*9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.*/

class Student{

int rollNo;

int sub1;
int sub2;
int sub3;
Double average;

 Student(int rollNo,int sub1,int sub2, int sub3,double average){

	this.rollNo=rollNo;
	this.sub1=sub1;
	this.sub2=sub2;
	this.sub3=sub3;
	this.average=average;

	}
public int getRollNo(){
return rollNo;
}
public int getSub1(){
return sub1;
}
public int getSub2(){
return sub2;
}
public int getSub3(){
return sub3;
}
public double getAverage(){
return average;
}


    public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
	
		int i=0;

		Student[] stu=new Student[10];

		while(i<10){	

			System.out.println("Enter the rollno");
			int rollno=scan.nextInt();
			System.out.println("Enter the mark sub1");			
			int sub1=scan.nextInt();
			System.out.println("Enter the mark sub2");
			int sub2=scan.nextInt();
			System.out.println("Enter the mark sub3");
			int sub3=scan.nextInt();
				
			double average=(double)(sub1+sub2+sub3)/3;

			Student student=new Student(rollno,sub1,sub2,sub3,average);

			stu[i]=student;			
			
			i++;
		}
		for(Student s:stu){

			System.out.println(s.getRollNo()+"\t"+s.getSub1()+"\t"+s.getSub2()+"\t"+s.getSub3()+"\t"+s.getAverage());

		}

	}
}

/*10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/

class MultiDimMatrix{

     public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the row value");

	int m=scan.nextInt();

	System.out.println("Enter the col value");

	int n=scan.nextInt();

	int wholeSum=0;
		
	int[][] arr=new int[m][n];

	for(int i=0;i<m;i++){

		for(int j=0;j<n;j++){
			
			arr[i][j]=scan.nextInt();
			wholeSum+=arr[i][j];

		}

	}

	display(arr);
	rowWise(arr);
	colWise(arr);

	Transpose(arr);

	System.out.println("The sum of matrix: "+ wholeSum);
}
static void display(int[][] arr){

	for(int i=0;i<arr.length;i++){

		for(int j=0;j<arr[0].length;j++){

			System.out.println(arr[i][j]);

		}
	}


}
	static void rowWise(int[][] arr){

	int sum=0;


	for(int i=0;i<arr.length;i++){

		for(int j=0;j<arr[0].length;j++){
			sum+=arr[i][j];
		}
		System.out.println("The row wise add: "+sum);
		sum=0;
	}



	}
	static void colWise(int[][] arr){
	
	int sum=0;

	for(int i=0;i<arr.length;i++){

		for(int j=0;j<arr[0].length;j++){

		sum+=arr[j][i];
		}
		System.out.println("The col wise add: "+sum);
		sum=0;
	  }

	}

	

	
static void Transpose(int[][] arr){
	
	

	for(int i=0;i<arr.length;i++){

		for(int j=i;j<arr[0].length;j++){
		int temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
		}
		
		
	}
 	System.out.println("after Transpose");
	colWise(arr);
	rowWise(arr);


	}	

	

	

}

/*1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌*/
class AddBinary{

	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	String a=scan.nextLine();

	String b=scan.nextLine();

	if(a.length()<b.length()){
	     String temp=b;
		b=a;
		a=temp;
	}
		
	int large=a.length()-1;

	int small=b.length()-1;

	char carry='0';

	String ans="";

	while(large>=0){

	if(small>=0){

	if(a.charAt(large)=='1'&&b.charAt(small)==a.charAt(large)){

	if(carry=='1'){
	 ans='1'+ans;
	 carry='1';
	}else {
	
	  ans='0'+ans;
	  carry='1';
	}
	}else if(a.charAt(large)=='0'&&b.charAt(small)==a.charAt(large)){

	if(carry=='1'){
	 ans='1'+ans;
	 carry='0';
	}else {
	
	  ans+='0';
	  carry='1';
	}


	}else{

	if(carry=='1'){
	 ans='1'+ans;
	 carry='1';
	}else {
	
	  ans='1'+ans;
	  
	}

	}
	small--;
	large--;
	continue;
	}
	if(carry=='1'&&a.charAt(large)=='1'){

	ans='0'+ans;
	carry='1';
	large--;
	continue;

	}
	
	
	ans=a.charAt(large)+ans;
	large--;
	}

	if(carry=='1'){
	ans='1'+ans;
	}

	System.out.println(ans);
	


	}
}

				//Day-2 Assesment-3

/* Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.*/	

class ExcelSheet{

public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	char[]arr={'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};

	System.out.println("Enter the number");


	int n=scan.nextInt();
	
	String s="";

	while(n>0){

	
	s=arr[n%26]+s;
	if(n%26==0){
		n--;
        }

	n/=26;
	
	}
	System.out.println("The value is: "+ s);
     }
}

/* Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.*/

class ReverseVowels{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);

		String str=scan.nextLine();

		scan.close();
		
		String hint="";

		for(int i=0;i<str.length();i++){
		
			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='u'||str.charAt(i)=='U'){
		 hint+=str.charAt(i);

		}
		}

	

		int k=0;
		
		StringBuilder sb=new StringBuilder(str);

		for(int i=sb.length()-1;i>=0;i--){

								if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='u'||str.charAt(i)=='U'){
		 sb.setCharAt(i,hint.charAt(k++));

		}

		

		}

		System.out.println("The change after the String: "+sb.toString());

			

	}

}
/*String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌*/

class ShuffleString{

	public static void main(String[] args){
		
	Scanner scan=new Scanner(System.in);

	String s=scan.nextLine();

	String t=scan.nextLine();

	StringBuilder sb=new StringBuilder(t);

	for(int i=0;i<s.length();i++){

	     for(int j=0;j<sb.length();j++){
		if(s.charAt(i)==sb.charAt(j)){
			sb.setCharAt(j,'$');
			break;
		}

	     }
	}

	for(int i=0;i<sb.length();i++){
	    if(sb.charAt(i)!='$'){

			System.out.println(sb.charAt(i));
			break;

		}

	}

    }
}
/*5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).*/

class SubSequence{

	public static void main(String[] args){		

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the string of s");

	String s=scan.nextLine();

	System.out.println("Enter the string of t");

	String t=scan.nextLine();

	scan.close();

	int k=0;
	int iden=0;

	for(int i=0;i<s.length();i++){

		for(int j=k;j<t.length();j++){
		
		if(s.charAt(i)==t.charAt(j)){

			k++; 
			iden++;
			break;

		}
		k++;

		

		}

	}
	
	if(iden==s.length()){
	
		System.out.println("The string is a subsequence");

	}else{

		System.out.println("The string is not subsequence");

	}


 	}
}

/*Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌*/

class StringAdd{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the string of num1");

	String num1=scan.nextLine();

	System.out.println("Enter the string of num2");

	String num2=scan.nextLine();

	scan.close();

	int number1=convertToString(num1);

	int number2=convertToString(num2);

	System.out.println("The number of addition is: "+(number1+number2));
	}
	static int convertToString(String num1){

	int num=0;
	int i=0;
	
	while(i<num1.length()){

		num=num*10+num1.charAt(i)-'0';

		i++;

	}

	return num;
	}
	
}

/*7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌*/

class Segment{

	public static void main(String[] args){

Scanner scan=new Scanner(System.in);

	System.out.println("Enter the string ");

	String str=scan.nextLine();

	int count=0;

	for(int i=1;i<str.length();i++){
	
	if(str.charAt(i)==' '&&str.charAt(i-1)!=' '){

		count++;	

	}


	}
	System.out.println("The number of words: "+(count+1));

	}
}

/*8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.*/

class CapsOrLow{

	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the string");

	String word=scan.nextLine();

	scan.close();

	int capsCount=0;

	int smallCount=0;

	for(int i=0;i<word.length();i++){

	if(word.charAt(i)>64&&word.charAt(i)<91){
	capsCount++;
	}else if(word.charAt(i)>96&&word.charAt(i)<123){
	smallCount++;
	}
	}
	
	if(smallCount==word.length()||capsCount==word.length()){
		System.out.println(true);
	}else if(smallCount==word.length()-1&&(word.charAt(0)>64&&word.charAt(0)<91)){
		System.out.println(true);
		
	}else{
		System.out.println(false);
	}

	

	

     }
}





		



	






