/*5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.*/

class Department implements Cloneable{
private int id;
private String dept;

Department(int id,String dept){
this.id=id;
this.dept=dept;
}
protected Department clone()throws CloneNotSupportedException{
return (Department)super.clone();
}
void display(){
System.out.println("Department Id"+id);
System.out.println("Department: "+dept);
}
}

class Student implements Cloneable{

private int id;
private String name;
private Department d;

Student(int id,String name,Department d){
this.id=id;
this.name=name;
this.d=d;
}

void display(){
System.out.println("student id: "+id);
System.out.println("studentname: "+name);
d.display();
}
protected Student clone()throws CloneNotSupportedException{
return (Student)super.clone();
}
}

class Main{

	public static void main(String[] args)throws Exception{
	Department dept=new Department(1,"cyber");

	Student s1=new Student(1,"raja",dept);

	Student s2=s1.clone();
	s1.Department.dept="Maths";

	s1.display();

	s2.display();

	}
}
	

