/*4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times. Use synchronization to avoid race conditions and display the final value.*/

class PrintCount{
	private int counter;
	
	public synchronized void print(){   //avoid synchronized its missing some counts
	int i=0;
	for(i=0;i<1000;i++){
	counter++;
	}
	}
	

	public int getCounter(){
	return counter;
	}
}
class Main{
	
	public static void main(String[] args){

	PrintCount pc=new PrintCount();

	Thread t1=new Thread(()->pc.print());
	t1.start();
	Thread t2=new Thread(()->pc.print());
	t2.start();
	Thread t3=new Thread(()->pc.print());
	t3.start();
	
	
	
	try{
	
	t3.join();
	}catch(InterruptedException e){
	System.out.println(e.getMessage());
	}

	System.out.println("all are threads in joins in the main thread: "+pc.getCounter());

	}
}
	
