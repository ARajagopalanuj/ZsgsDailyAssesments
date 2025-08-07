/*7. Develop a Java program to illustrate the usage of toString() method.*/

class Marks{
	private int id;
	private int marks;
	private String name;

	Marks(int id, int marks,String name){
	this.id=id;
	this.marks=marks;
	this.name=name;
	}
	
	public String toString(){
	return "id: "+id+"\nname: "+name+"\nmarks: "+marks;
	}
	
}

class Student{
	
	public static void main(String[] args){

	Marks mark=new Marks(1001,90,"jana");
	System.out.println(mark.toString());	
	
	}
}