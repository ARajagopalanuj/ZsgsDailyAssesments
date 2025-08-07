/*2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.*/
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

class LList{

	public static void main(String[] args){
		
		LinkedList<Integer>list=new LinkedList<>();

		list.add(100);

		list.add(20);

		list.add(9);
	//append the specified element to the end of a linked list.
		Iterator itr=list.iterator();
		System.out.println("list all elements");
		while(itr.hasNext()){
		System.out.println(itr.next());
		}

	//iterate through all elements in a linked list.						System.out.println("Starting with second limit");
		int specifiedIndex=1;
	//iterate through all elements in a linked list starting at the specified position.
		System.out.println("iterate through all elements in a linked list starting at the specified position.");
		for(int i=specifiedIndex;i<list.size();i++){
			System.out.println(list.get(i));
		}
	//iterate a linked list in reverse order.
		System.out.println("iterate a linked list in reverse order.");
		for(int i=list.size()-1;i>=0;i--){
			System.out.println(list.get(i));
		}
		
	//insert the specified element at the specified position in the linked list.

		int specifiedPosition=1;
		list.add(specifiedPosition,200);
		System.out.println("insert the specified element at the specified position in the linked list.");

		System.out.println(list);

	//insert elements into the linked list at the first and last position.
	System.out.println("insert elements into the linked list at the first and last position.");

		list.add(0,1000);
		list.add(2000);
		System.out.println(list);
	// insert the specified element at the front of a linked list.

		System.out.println("insert the specified element at the front of a linked list.");
		list.add(0,999);
		System.out.println(list);

	//h. insert the specified element at the end of a linked list.

		System.out.println("insert the specified element at the end of a linked list.");
		list.add(999);
		System.out.println(list);

		System.out.println("insert some elements at the specified position into a linked list.");
		
	System.out.println();
	
	System.out.println("Enter the number of how many elements");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	
	for(int i=0;i<n;i++){
		System.out.println("Enter the position");
		 int pos=scan.nextInt();
		System.out.println("Enter the element");
		int element=scan.nextInt();

		list.add(pos,element);
		System.out.println(list);
	}
	// get the first and last occurrence of the specified elements in a linked list

	System.out.println(" get the first and last occurrence of the specified elements in a linked list");

	System.out.println("Enter the Element");
	int findElement=scan.nextInt();

	System.out.println("First index of element: "+list.indexOf(findElement)+"\nLast indes of element: "+list.lastIndexOf(findElement));
	
	}
}


		

		
		

