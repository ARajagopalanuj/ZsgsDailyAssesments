/*‌
2. Can we override private method, constructor, static method, final method? Illustrate with an example.*/


/*
class Parent{

	private void method(){

	System.out.println("method check");

	}

}

class Child extends Parent{


	

	public static void main(String[] args){
	Child child=new Child();

	child.method();
	}
}

compile time error:
OverrideCheck.java:22: error: cannot find symbol
        child.method();
             ^
  symbol:   method method()
  location: variable child of type Child
1 error
*/


 /* do not to make a duplicate constructor in child class*/

/*
class Parent{

	static void method(){

	System.out.println("method check");

	}

}

class Child extends Parent{

	
	void method(){

	System.out.println("method check");

	}

	

	public static void main(String[] args){
	Parent child=new Child();

	child.method();
	}
}
compile time error-->

OverrideCheck.java:41: error: method() in Child cannot override method() in Parent
        void method(){
             ^
  overridden method is static
1 error


*/
class Parent{

	final void method(){

	System.out.println("method check");

	}

}


/*
class Child extends Parent{

	
	void method(){

	System.out.println("method check");

	}

	

	public static void main(String[] args){
	Parent child=new Child();

	child.method();
	}
}

compile time error-->

OverrideCheck.java:92: error: method() in Child cannot override method() in Parent
        void method(){
             ^
  overridden method is final
1 error*/






