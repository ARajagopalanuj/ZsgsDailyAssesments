/*2. Develop a Java program which illustrates the usage of Comparator Interface.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Marks  
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
}
class CompareClass implements Comparator<Marks>{
	public int compare(Marks obj1,Marks obj2){
	 Marks s1=(Marks)obj1;

	Marks s2=(Marks) obj2;

	if(s1.marks>s2.marks){
	return -1;
	}else if(s1.marks<s2.marks){
	return 1;
	}else{
	return 0;
	}
	}
}

class Main{

public static void main(String[] args){

 ArrayList<Marks>list=new ArrayList<>();

	list.add(new Marks(1001,99,"raja"));
	list.add(new Marks(1002,100,"jana"));
	list.add(new Marks(110,80,"Gopal"));
	list.add(new Marks(117,100,"Udhaya"));
	CompareClass cc=new CompareClass();
	Collections.sort(list,cc);
	System.out.println(list);

	
	}
}

	
