/*6. Develop a Java program to illustrate pass-by-value.*/

class PassByValue{
	
	public static void main(String[] args){

	int a=10;

	int b=20;

	System.out.println("The sum of number is: "+add(a,b));

	}
	
	public static int add(int a, int b){
	return a+b;	
	}


}
