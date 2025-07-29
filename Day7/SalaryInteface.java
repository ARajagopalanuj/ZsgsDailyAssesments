/*4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.*/
interface Employee{
  public void calculateSalary();
}

class FullTimeEmployee implements Employee{

public void calculateSalary(){
System.out.println(50000.00);
}
}

class PartTimeEmployee implements Employee{


public void calculateSalary(){
System.out.println(25000.00);
}
}

class PutSalary{

public static void main(String[] args){

Employee pte=new PartTimeEmployee();

Employee fte=new FullTimeEmployee();

pte.calculateSalary();

fte.calculateSalary();
}
}