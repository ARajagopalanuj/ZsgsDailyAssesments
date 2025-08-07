/*5. Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.
Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM machine, where create thread to check the PIN number, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt*/
import java.util.ArrayList;
import java.util.Scanner;
class ProCos{

	int capacity=5;
	ArrayList<Integer>list=new ArrayList<>();

	public synchronized void addItems(int n){
	if(capacity==list.size()){
	
	try{
	System.out.println("wait is executed");
	wait();

	}catch(InterruptedException e){
	System.out.println(e.getMessage());
	}
	
	}
	list.add(n);
	
	System.out.println(list);
	
	notify();
	

}
	
	
 	public synchronized void removeItems(){

	if(list.isEmpty()){
	try{
	wait();
	}catch(InterruptedException e){
	System.out.println(e.getMessage());
	}
	}
	if(list.size()<capacity){
	notify();
	}
	

	while(!list.isEmpty()){
	
	int value=list.removeFirst();
	System.out.println("Remove element: "+value);	
	}
	
	
	}

}
class Main{

	public static void main(String[] args){

	ProCos pc=new ProCos();
	Scanner scan=new Scanner(System.in);
	while(true){

	System.out.println("Enter the sleep time\nEnter 0 to exit"); 
	int n=scan.nextInt();
	if(n==0){
	break;
	}
				

	Thread  t1=new Thread(()->{
				for(int i=0;i<10;i++){
				
				try{
				Thread.sleep(1000);
				}catch(InterruptedException e){
				System.out.println(e.getMessage());
				}
				pc.addItems(i);
				}			
				});

	Thread  t2=new Thread(()->{
				for(int i=0;i<10;i++){
				
				
				try{
				Thread.sleep(n);
				}catch(InterruptedException e){
				System.out.println(e.getMessage());
				}
				pc.removeItems();
				}
				});

	t1.start();
	
	t2.start();

	}

				
	


	}
}
	
