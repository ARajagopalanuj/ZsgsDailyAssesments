/*3. Design a class`Employee with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.*/

class Employee{

private int employeeId;
private String name;
private String designation;
private String department;
private double monthlySalary;
private double annualSalary;

	public void setEmployeeId(int employeeId){
	this.employeeId=employeeId;
	}

	public int getEmployeeId(){
	return employeeId;
	}

	public void setName(String name){
	this.name=name;
	}

	public String getName(){
	return name;
	}

	public void setDesignation(String designation){
	this.designation=designation;
	}

	public String getDesignation(){
	return designation;
	}

	public void setDepartment(String department){
	this.department=department;
	}

	public String getDepartment(){
	return department;
	}

	public void setMonthlySalary(double monthlySalary){
	this.monthlySalary=monthlySalary;
	}

	public double getMonthlySalary(){
	return monthlySalary;
	}

	public void setAnnualSalary(double annualSalary){
	this.annualSalary=annualSalary;
	}

	public double getAnnualSalary(){
	return annualSalary;
	}

	public static void main(String[] args){

	Employee emp=new Employee();

	emp.setEmployeeId(1001);
	emp.setName("Raja");
	emp.setDesignation("Developer");
	emp.setDepartment("IT");
	emp.setMonthlySalary(40000.00);
	double annualSalary=emp.getMonthlySalary()*12;
	emp.setAnnualSalary(annualSalary);
	
	System.out.println("EmployeeId: "+emp.getEmployeeId());
	System.out.println("Employee name: "+emp.getName());
	System.out.println("Employee role: "+emp.getDesignation());
	System.out.println("Employee Department: "+emp.getDepartment());
	System.out.println("Employee Monthly Salary: "+emp.getMonthlySalary());
	System.out.println("Employee Annual Salary: " + emp.getAnnualSalary());
	}
}






	

