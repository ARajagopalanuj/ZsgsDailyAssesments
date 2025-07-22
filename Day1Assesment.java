/*1)  Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?*/
import java.util.Scanner;
class ScopeOfVariable{

static int staticVariable;
int instanceVariable;
static final int finalValue=10;

public static void main(String[] args){

     int localVariable=10;
       {
	int blockVariable=100;
	System.out.println("Block Variable: " + blockVariable);

       }
     System.out.println("Local Variable: "+localVariable);

     System.out.println("Static Variable "+ScopeOfVariable.staticVariable);

     ScopeOfVariable sov=new ScopeOfVariable();


     System.out.println("Instance Variable: "+ sov.instanceVariable);

     //sov.finalValue=100;  throws the error..

      System.out.println("Final value: "+ finalValue);
    }
}



/*2) Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.*/

class DataTypes{

  public static void main(String[] args){
	
	int intValue=999999;
	
	long longValue=100000000;

	short shortValue=100 ;

	boolean booleanVal=true;

	char character='R';

	double doubleValue=12.1234567898765432;

	Float floatValue=12.12345f;

	Byte byteValue=0;

	System.out.println("Integer value: " +intValue + "\n Long Value: 	"+longValue+"\nshort Value:"+shortValue+"\n Byte Value: "+byteValue+"\n Float 	Value: "+floatValue+"\n Character Value: "+character+"\n Double Value: 	"+doubleValue+"\n Boolean Value: "+ booleanVal);

	


  }
}

/* 3) Write a program to find the maximum of two numbers using ternary operator.*/


class findMaximum{
   
     public static void main(String[] args){

	int firstVal=100;
	int secondVal=200;

	System.out.println(firstVal<secondVal?secondVal:firstVal);
     }
}

/* Write a program to check whether the given two numbers are equal or not w/o using comparison operator?*/

class checkEqual{

	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the first number");

	int firstVal=scan.nextInt();

	System.out.println("Enter the second val");

	int secondVal=scan.nextInt();

	try{
		int num=firstVal^secondVal;

		firstVal=firstVal/num;

		System.out.println("these numbers are not equal");
  		
	}catch(Exception e){

		System.out.println("these numbers are equal");

	}
		

    }
}
/*Write a program that illustrate the execution order of static block and initializer block?*/

class BlockExecute{

	{
		System.out.println("the instance block is executed");
	}
	static{
		System.out.println("The static block is executed");
	}
   
    public static void main(String[] args){
	
	BlockExecute Be=new BlockExecute();	

    }
}

/*Write a program that illustrate the Explicit type casting?*/

class TypeCast{

     public static void main(String[] args){
	int intValue=100;
	long longValue=(long)intValue;
	char charValue='A';
	int character=(int)charValue;
	System.out.println("type caste before long value "+ longValue);
	System.out.println("type caste before int value "+ character);

   }


}

/*Write a program to check if a number is a power of 2?*/

class PowerOf2{

     public static void main(String[] args){

	int num=12;

	boolean val=true;

	while(num>0){

	if(num%2==0){

		num/=2;

	}else if(num==1){

		System.out.println("true");
		
		val=false;

		break;	
	}else{

		break;

        }
      }

	if(val){
		System.out.println("False");
	}


     }
}

/* Write a program to find the first set bit of a number?*/

class FirstSetBit{

     public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the number: ");

	int input=scan.nextInt();

	scan.close();

	String binaryValue="";

	while(input>0){

	int rem=input%2;

	binaryValue=rem+binaryValue;

	input/=2;

	}
	int count=0;
	for(int i=binaryValue.length()-1;i>=0;i--){

		count++;
	
		if(binaryValue.charAt(i)=='1'){
			System.out.println(count);
			break;
		}
	}

     }
}

/* Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?*/

class Employee{

	private int empId;

	private String name;

	private String department;

	private double salary;


	Employee(int empId,String name,String department,double salary){
		
		this.empId=empId;
		this.name=name;
		this.department=department;
		this.salary=salary;

	}

	

	public static void main(String[] args){
		
		Employee employee=new Employee(1,"Raja","devloper",40000.00);

		System.out.println("empID: " + employee.empId);

		System.out.println("Name: " + employee.name);

		System.out.println("Department: " + employee.department);

		System.out.println("Salary: ");

		System.out.printf("%.2f",employee.salary);

		
		
	}
}

/*10 Write a program to check whether the object is an instance of a particular class?
*/

class Cars{

     public static void main(String[] args){

	Cars cars=new Cars();

	System.out.println(cars instanceof Cars);		
		

     }
}