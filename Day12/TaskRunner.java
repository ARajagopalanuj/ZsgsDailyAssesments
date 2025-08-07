/*2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks.*/


class TaskRunner implements Runnable{

	public void run(){

	for(int i=0;i<10;i++){
	System.out.println("Thread Name: "+Thread.currentThread().getName());
	try{
	Thread.sleep(1000);
	}catch(InterruptedException e){
	System.out.println(e.getMessage());
	}

	}
	}
}
class Main{

	public static void main(String[] args){

	TaskRunner task1=new TaskRunner();
	TaskRunner task2=new TaskRunner();

	Thread thread=new Thread(task1);
	Thread thread1=new Thread(task2);

	thread.setName("Rekhla");
	thread1.setName("Udhaya");

	thread.start();
	thread1.start();

	

	}
}
