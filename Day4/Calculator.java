/*7. Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.*/


class BasicCalculator{

 	public int add(int a,int b){
	return a+b;
	}

	public int sub(int a,int b){
	return a-b;
	}

	public int multiply(int a, int b){
	return a*b;
	}

	public double divide(int a,int b){
	return (double)a/b;
	}

}

class AdvancedCalculator extends BasicCalculator{

	public int power(int a, int b){
	for(int i=0;i<b;i++){
	a*=a;
	}
	return a;
	}

	public int modulus(int a, int b){
	return a%b;
	}

	public int sqrt(double number){
	int n=(int)number;
	for(int i=1;i<n;i++){
	if(i*i>=n){
	if(i*i==n){
	 return i;
	}
	return i-1;
	}
	}
	return 0;
	}
}
class ScientificCalculator extends AdvancedCalculator{

 	public double sin(double angle){
	return Math.sin(angle);
	}

 	public double cos(double angle){
	return Math.cos(angle);
	}

	public double log(double angle){
	return Math.log(angle);
	}

	public double exp(double angle){
	return Math.exp(angle);
	}


}

class Calculator{

	public static void main(String[] args){
	

	ScientificCalculator calc= new ScientificCalculator();

	System.out.println("Addition: "+ calc.add(20,50));

	System.out.println("Subraction: "+calc.sub(60,40));

	System.out.println("Multiplication: "+calc.multiply(10,10));

	System.out.println("Division: "+calc.divide(100,10));

	System.out.println("power of: "+ calc.power(10,3));

	System.out.println("Modulus: "+calc.modulus(100,10));

	System.out.println("square root: "+calc.sqrt(100.00));

	System.out.println("Sin value: "+calc.sin(90.00));

	System.out.println("Cos value: "+calc.cos(90.00));

	System.out.println("log value: "+ calc.log(60.00));

	System.out.println("exp value: "+ calc.exp(30.00));

	}
}
	

	
