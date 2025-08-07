/*Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.*/

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

class Tset{

	public static void main(String[] args){

//a. create a new tree set, add some colours (string) and print out the tree set.
		
	System.out.println("a. create a new tree set, add some colours (string) and print out the tree set.");
System.out.println();

	TreeSet<String>colors=new TreeSet<>();

	colors.add("blue");

	colors.add("red");

	colors.add("violet");

	System.out.println(colors);

//b. iterate through all elements in a tree set.
System.out.println();
System.out.println(" iterate through all elements in a tree set.");
System.out.println();

	for(String s:colors){
	System.out.println(s);
	}

//c. add all the elements of a specified tree set to another tree set.	
System.out.println();
System.out.println("c. add all the elements of a specified tree set to another tree set.");	
System.out.println();


	TreeSet<String>copySet=new TreeSet<>(colors);	

	System.out.println(copySet);

//d. create a reverse order view of the elements contained in a given tree set.
System.out.println();
System.out.println("d. create a reverse order view of the elements contained in a given tree set.");
System.out.println();

	Iterator desc=colors.descendingIterator();

	while(desc.hasNext()){
	System.out.print(desc.next()+" ");
	}
//get the first and last elements in a tree set.
System.out.println();
System.out.println("get the first and last elements in a tree set.");
System.out.println();

	System.out.println("First Element: "+colors.first());
	System.out.println();
	System.out.println("Last Element: "+colors.last());	
	System.out.println();
//f. clone a tree set list to another tree set.

System.out.println("clone a tree set list to another tree set.");
System.out.println();

	TreeSet<String>clone=new TreeSet<>(colors);
	//TreeSet<String>clone=(TreeSet<String>) colors.clone();
	System.out.println(clone);

System.out.println();
//g. get the number of elements in a tree set.
System.out.println("g. get the number of elements in a tree set.");

System.out.println("number of elements: "+ colors.size());

// compare two tree sets.
System.out.println();
System.out.println("compare two tree sets.");

	if(colors.equals(clone)){
	System.out.println("These two sets are equal");
	}else{
	System.out.println("These are not equal");
	}


/*Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.*/

	TreeSet<Integer>set=new TreeSet<>();

	set.add(1);

	set.add(5);
	
	set.add(100);

	set.add(1001);
//i. find the numbers less than 7 in a tree set.
System.out.println("i. find the numbers less than 7 in a tree set.");
System.out.println();
	for(int n:set){
	if(n>=7){
	break;
	}
	System.out.print(n+" "); 
	}

//j. get the element in a tree set which is greater than or equal to the given element.
System.out.println("j. get the element in a tree set which is greater than or equal to the given element.");
System.out.println();

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the element");
	{
	int givenElement=scan.nextInt();
	
	System.out.println("\n Greater elements: ");

	for(int n:set){
	if(n>=givenElement){
	System.out.print(n+" "); 
	}
	
	}
	}

//k. get the element in a tree set which is less than or equal to the given element.
System.out.println();
System.out.println("get the element in a tree set which is less than or equal to the given element.");
System.out.println();

	System.out.println("Enter the element");
	{
	int givenElement=scan.nextInt();
	
	System.out.println("\n smaller elements: ");

	System.out.println(set.floor(givenElement));

	/*for(int n:set){
	if(n<=givenElement){
	System.out.print(n+" "); 
	}
	
	}*/
	}

//l. get the element in a tree set which is strictly greater than or equal to the given element.

System.out.println();
System.out.println("l. get the element in a tree set which is strictly greater than or equal to the given element.\n");

	System.out.println("Enter the element");
	{
	int givenElement=scan.nextInt();
	
	System.out.println("\n smaller elements: ");
	
	System.out.println(set.ceiling(givenElement));
	/*for(int n:set){
	if(n>givenElement){
	System.out.print(n+" "); 
	}
	
	}*/
	}
//m. get an element in a tree set which is strictly less than the given element.
               
	System.out.println("Enter the element");
	{
	int givenElement=scan.nextInt();
	
	System.out.println("\n Greater elements: ");

	for(int n:set){
	if(n<givenElement){
	System.out.print(n+" "); 
	}
	
	}
	}

//n. retrieve and remove the first element of a tree set.
System.out.println();
System.out.println("n. retrieve and remove the first element of a tree set.");
System.out.println();

	set.pollFirst();
	System.out.println(set);

//o. retrieve and remove the last element of a tree set.
System.out.println();
System.out.println("o. retrieve and remove the last element of a tree set.");
System.out.println();
		
	set.pollLast();
	System.out.println(set);

//p. remove a given element from a tree set

System.out.println("remove a given element from a tree set");

	System.out.println("Enter the Element");
	{
		int givenElement=scan.nextInt();
		set.remove(givenElement);				
	}
	System.out.println(set);



	
	}
}