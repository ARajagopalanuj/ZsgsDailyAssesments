/*1. Illustrates with an example of using Singleton class.*/

class SingleTon{

	public static SingleTon s=null;
	
	private SingleTon(){
		
	}

	public static SingleTon getInstance(){
	if(s==null){
	s=new SingleTon();
	}
	return s;
	}
}

class single{

	public static void main(String[] args){

	SingleTon s1=SingleTon.getInstance();
	
	SingleTon s2=SingleTon.getInstance();

	System.out.println(s1+"   " +s2);

	}
}
/* This  is used for make one and only object its uses for space complexity the private constructor is has not to be create any object in out side in class  if  we need to call the function in static method to get the object then use */ 
