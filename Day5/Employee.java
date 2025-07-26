/*3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.
*/

class Employee{
void calculateSalary(){
	 
}

}
class PartTimeEmployee extends Employee{

void calculateSalary(){
System.out.println();
System.out.printf("%.2f",10000.00);

}
}
class FullTimeEmployee extends Employee{

void calculateSalary(){
System.out.println();
System.out.printf("%.2f",25000.00);
}
}
class Salary{

	public static void main(String[] args){

		Employee fte=new FullTimeEmployee();

		Employee pte=new PartTimeEmployee();

		fte.calculateSalary();

		pte.calculateSalary();	

	}
}
