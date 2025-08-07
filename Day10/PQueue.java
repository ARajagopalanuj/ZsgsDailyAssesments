/*5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.*/
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.HashSet;


class PQueue{

	public static void main(String[] args){


// create a new priority queue, add some colors (string) and print out the elements of the priority queue.

System.out.println(" create a new priority queue, add some colors (string) and print out the elements of the priority queue.");

System.out.println();


	PriorityQueue<String>queue=new PriorityQueue<>();

	queue.add("blue");

	queue.add("brown");

	queue.add("lavendor");

	queue.add("green");

	System.out.println(queue);
//2. iterate through all elements in priority queue.
System.out.println();
System.out.println("2. iterate through all elements in priority queue.");		
System.out.println();

	for(String s:queue){
	System.out.println(s+" ");
	}

//3. add all the elements of a priority queue to another priority queue.
System.out.println();
System.out.println("3. add all the elements of a priority queue to another priority queue.");
System.out.println();

		//PriorityQueue<String>copyQueue=(PriorityQueue<String>) queue.clone();
		
		PriorityQueue<String>copyQueue=new PriorityQueue<>(queue);
		System.out.println("copy another queue");
		System.out.println(queue);

		System.out.println();

//4. insert a given element into a priority queue
System.out.println();
System.out.println("4. insert a given element into a priority queue");
System.out.println();

	Scanner scan=new Scanner(System.in);
	{
	System.out.println("number of element add in queue");
	int n=scan.nextInt();
	scan.nextLine();
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++){
	queue.add(scan.nextLine());
	}
	}

	System.out.println("After add queue");

	System.out.println(queue);

//6. count the number of elements in a priority queue.
System.out.println();
System.out.println("6. count the number of elements in a priority queue.");
System.out.println();

	System.out.println("number of elements in queue: "+ queue.size());
//7.compare two priority queues.
System.out.println();
System.out.println("compare two priority queues.");
System.out.println();

	
	

	if(new HashSet<>(queue).equals(new HashSet<>(copyQueue))){
	System.out.println("These queues are equal");
	}else{
	System.out.println("These are not equal");
	}


//8. retrieve the first element of the priority queue.
System.out.println();
System.out.println("8. retrieve the first element of the priority queue.");
System.out.println();

	System.out.println("First element: "+queue.peek());
	System.out.println(queue);


//9. retrieve and remove the first element.
System.out.println();
System.out.println("9. retrieve and remove the first element.");
System.out.println();

	System.out.println("First element: "+queue.poll());
	System.out.println(queue);

//10. convert a priority queue to an array containing all of the elements of the queue.
System.out.println();
System.out.println("10. convert a priority queue to an array containing all of the elements of the queue.");
System.out.println();

	String[] arr=queue.toArray(new String[queue.size()]);

	for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
	}

//5. remove all the elements from a priority queue.
System.out.println();
System.out.println("5. remove all the elements from a priority queue.");
System.out.println();

	queue.clear();

	System.out.println(queue);


	
	

	
	
	}
}