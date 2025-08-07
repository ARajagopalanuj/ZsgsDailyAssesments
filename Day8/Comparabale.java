/*3. Develop a Java program which illustrates the usage of Comparable Interface.*/

import java.util.Collections;
import java.util.ArrayList;

class Marks  implements Comparable<Marks>
{
	private int  id;
	int marks;
	 String name;

	Marks(int id, int marks, String name){
	this.id=id;
	this.marks=marks;
	this.name=name;
	}

	public String toString(){
	return "id: "+id+" name: "+name+" marks: "+marks;
	}  
	public int compareTo(Marks s){
	return Integer.compare(this.marks,s.marks);
	}


}
class Main{

public static void main(String[] args){

 ArrayList<Marks>list=new ArrayList<>();

	list.add(new Marks(1001,99,"raja"));
	list.add(new Marks(1002,100,"jana"));
	list.add(new Marks(110,80,"Gopal"));
	list.add(new Marks(117,100,"Udhaya"));
	
	Collections.sort(list);
	System.out.println(list);

	
	}
}
