/*3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference*/
abstract class Employee{
abstract  void calculateSalary();
}

class FullTimeEmployee extends Employee{

void calculateSalary(){
System.out.println(50000.00);
}
}

class PartTimeEmployee extends Employee{


void calculateSalary(){
System.out.println(20000.00);
}
}

class Salary{

public static void main(String[] args){

Employee pte=new PartTimeEmployee();

Employee fte=new FullTimeEmployee();

pte.calculateSalary();

fte.calculateSalary();
}
}



