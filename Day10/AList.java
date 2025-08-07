/*1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.
‌*/

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class AList{

	public static void main(String[] args){

	ArrayList<String>colors=new ArrayList<>();
	Scanner scan=new Scanner(System.in);

	colors.add("Green");

	colors.add("blue");

	colors.add("Yellow");

	System.out.println(colors);

	Iterator itr=colors.iterator();


	//b. to iterate through all elements in an array list.


	while(itr.hasNext()){
	System.out.println(itr.next());
	}

	System.out.println("Enter the color to insert into the list");
	String icolor=scan.nextLine();

	//to insert an element into the array list at the first position.
	colors.add(0,icolor);
	System.out.println(colors);

	// to retrieve an element (at a specified index) from a given array list.	

	System.out.println("Enter the specify element index");
	int index=scan.nextInt();
	scan.nextLine();

	
	if(index<colors.size()){
	System.out.println(colors.get(index));		
	}else{
	System.out.println("Array Index Bound");
	}

	//to update specific array element by given element.

	System.out.println("Enter the speicfic Element");
	String whichElement=scan.nextLine();
	
	System.out.println("Enter the update Element");
	String updateElement=scan.nextLine();
	
	for(int i=0;i<colors.size();i++){
		if(colors.get(i).equals(whichElement)){
		colors.set(i,updateElement);
		}	
	}
	System.out.println(colors);

	//f. to remove the third element from an array list.

	colors.remove(2);
	System.out.println("after Third Element remove");
	System.out.println(colors);

	//g. to search an element in an array list.

	System.out.println("search element");
	String searchElement=scan.nextLine();
	
	if(colors.contains(searchElement)){
	System.out.println("our list have this element");
	}else{
	System.out.println("our list doesn't have in this element");
	}

	//i. to copy one array list into another.
ArrayList<String>copy=new ArrayList<>(colors);
	System.out.println();
	System.out.println("Copy List");
	System.out.println(copy);
	System.out.println();


	// to sort a given array list.
	System.out.println("sorting our list");
	Collections.sort(colors);
	System.out.println(colors);


	
	//j. to shuffle elements in an array list.
	Collections.shuffle(colors);
	System.out.println("shuffle our list");
	System.out.println(colors);
	

	
		

	}

}





	


	

		

