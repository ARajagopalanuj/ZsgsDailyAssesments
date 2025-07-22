/*1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/

class Student{
private String name;
private int rollNo;

	
	Student(String name,int rollNo){

	this.name=name;
	this.rollNo=rollNo;	
	
	}

	void display(){

	System.out.println("Student name: "+name);
	System.out.println("Student Rollno: " + rollNo);
	}

public static void main(String[] args){

	Student student=new Student("Raja",2);

	student.display();


}
}

/*2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.*/

class Students{
private String name;
private int roll_No;
private int phone_No;
private String address;

	Students(String name,int roll_No,int phone_No,String address){
	this.name=name;
	this.roll_No=roll_No;
	this.phone_No=phone_No;
	this.address=address;
	}

	void display(){
		System.out.println("Student Name: " +name);
		System.out.println("Student Rollno: " +roll_No);
		System.out.println("Student Contact: " +phone_No);

		System.out.println("Student Address: " +address);


	}
     public static void main(String[] args){

		Students st1=new Students("Sam",0001,111111,"aa,bbb,cccc");
		Students st2=new Students("John",0002,222222,"jjjoookkk");
	st1.display();	
	st2.display();		

	}
}

/*3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.*/


class Employee{
private String name;
private int empId;
private String designation;
private double salary;

	Employee(){
	};

	Employee(String name,int empId,String designation,double salary){

	this.name=name;
	this.empId=empId;
	this.designation=designation;
	this.salary=salary;

	}

	//copy constructor

	Employee(Employee employee){
	this.name=employee.name;
	this.empId=employee.empId;
	this.designation=employee.designation;
	this.salary=employee.salary;	


	}
	void display(){
		System.out.println("Employee name: "+name);
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee designation: "+designation);
		System.out.println("Employee salary: "+salary);
	}

public static void main(String[] args){

	Employee employee=new Employee();
	
	Employee employee1=new Employee("Raja",1001,"Developer",40000.00);

	Employee employee2=new Employee(employee1);

	employee.display();

	employee1.display();

	employee2.display();
}
}
/*4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.*/
class Vehicle{
private int id;
private String name;
private Double price;
private static int count;

Vehicle(int id,String name,Double price){
this.id=id;
this.name=name;
this.price=price;
count++;
}

public static void main(String[] args){
Vehicle vehicle=new Vehicle(1001,"BMW",2000000.00);
System.out.println("The number of vehicles: " + Vehicle.count);

}
}

/*6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/


class Employees{
private String name;
private int year;
private double salary;
private String address;

Employees(String name,int year,String address){

this.name=name;
this.year=year;
this.address=address;
}
void display(){
System.out.println("Employee name" + name);
System.out.println("Employee year" + year);
System.out.println("Employee address" + address);
}
 
public static void main(String[] args){

Employees employees1=new Employees("Raja",2024,"64C- WallsStreat");
Employees employees2=new Employees("seeni",2025,"68D- WallsStreat");
Employees employees3=new Employees("Selvin",2023,"36V- WallsStreat");

employees1.display();
employees2.display();
employees3.display();
}



}




	





	