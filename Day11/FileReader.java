/*1. Write a Java program to read the contents of a text file and display it on the console.*/
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

class ReadFile{

	public static void main(String[] args){
	
	File file=new File("C:/Users/This Pc/Documents/Assignment/Day10/Account.txt");

	try(FileReader freader=new FileReader(file);

	BufferedReader breader=new BufferedReader(freader)){

	String line="";
	 

	while((line=breader.readLine())!=null){
	System.out.println(line);

	}
	}catch(Exception e){
	System.out.println(e.getMessage());
	}
	}
}

		
