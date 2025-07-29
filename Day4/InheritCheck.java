/*4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.*/

class Parent{

	void display(){

	System.out.println("Parent1 executed");

	}
}
class Parent1{

	void dislay(){

	System.out.println("Parent2 Executed");

	}
}

class Child extends Parent,Parent1{

	void cart(){
		System.out.println("The child class executed  with cart function");
	}

	public static void main(String[] args){

	Child child=new Child();
	child.display();
	}
}
/*InheritCheck.java:20: error: '{' expected
class Child extends Parent,Parent1{
                          ^
1 error*/

