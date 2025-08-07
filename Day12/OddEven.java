/*3. Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20. Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).*/

class Print{
int number=1;
public synchronized void oddPrint(){
	
	while(number<=20){

	if(number%2==0){
	try{
	wait();
	}catch(InterruptedException e){
	System.out.println(e.getMessage());	
	}
	}else{
	//System.out.println("Odd number:  "+number);
	number++;
	notify();
	}
	}

}
public synchronized void evenPrint(){
	
	while(number<=20){
	if(number%2!=0){
	try{
	wait();
	}catch(InterruptedException e){
	System.out.println(e.getMessage());	
	}
	}else{
	System.out.println("Even number: "+number);
	number++;
	notify();
	}
	}

	}
}

class Main{

	public static void main(String[] args){

	Print print=new Print();

	Thread t1=new Thread(()->print.oddPrint());
	Thread t2=new Thread(()->print.evenPrint());

	t1.start();
	t2.start();

	}
}
 


