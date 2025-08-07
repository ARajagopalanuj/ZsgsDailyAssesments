/*1. Write a Java program to demonstrate multithreading by extending the Thread class.
--->Create a class MyThread that extends Thread.
--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds between prints.
--->In the main() method, create two objects of MyThread and start them.
--->Each thread prints its message independently, showing concurrent execution.*/

class MyThread extends Thread{

public void run(){
for(int i=0;i<5;i++){
System.out.println("Thread Name: "+Thread.currentThread().getName());
try{
Thread.sleep(500);
}catch(InterruptedException e){
System.out.println(e.getMessage());
}
}
}

}
class Main{
public static void main(String[] args){

	MyThread thread=new MyThread();
	MyThread thread1=new MyThread();

	thread.setName("Rekhla");
	thread1.setName("Udhaya");

	thread1.start();
	thread.start();
	
	}
}


