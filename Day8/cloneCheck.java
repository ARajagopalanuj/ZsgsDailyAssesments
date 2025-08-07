/*8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable*/

class Student implements Cloneable{

String name;
private int rollNo;
Department dept;

	Student(String name,int rollNo, Department dept){
	this.name=name;
	this.rollNo=rollNo;
	this.dept=dept;	
	}

	

	protected Student clone() throws CloneNotSupportedException{
	Student cloned= (Student)super.clone();
	
cloned.dept=dept.clone();
	return cloned;	
	}
}
class Department implements Cloneable{
String name;

 Department(String name){
	this.name=name;
	}

	protected Department clone()throws CloneNotSupportedException{
	return (Department)super.clone();
	}
}
	

class Main{
	public static void main(String[] args){
	Department dept=new Department("DataAnalytics");
	Student student=new Student("raja",1001,dept);
	try{
	Student stud1=student.clone();


	System.out.println(student.dept.name);
	System.out.println(stud1.dept.name);
	student.dept.name="Cyber";
	System.out.println(student.dept.name);
	System.out.println(stud1.dept.name);

	}catch(CloneNotSupportedException e){
	System.out.println("Something happens "+e.getMessage());
	}
	}
}

/*     First Error wants to be a permission clone method
  Student stud1=student.clone();
                             ^
cloneCheck.java:28: error: incompatible types: Object cannot be converted to Student
        Student stud1=student.clone();*/




	/*Second for type Cast the clone methodC:\Users\This Pc\Documents\Assignment\Day8>javac cloneCheck.java
cloneCheck.java:28: error: incompatible types: Object cannot be converted to Student
        return super.clone();*/




/*C:\Users\This Pc\Documents\Assignment\Day8>java Main
Something happens Student

its a exception message because on this time  cannot implements the colaneable interface*/
