/*4. Write a Java program to append a text read from the user to an existing file without overwriting the original content.*/

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


class Filewrote{

	public static void main(String[] args){

	File file=new File("student.txt");


	try(PrintWriter pwriter=new PrintWriter(new FileWriter(file,true))){

	pwriter.write("\njava is object oriented programming language \njava is created by sun micro Systems java is robust language \n");
	
	pwriter.flush();
	}catch(Exception e){
		System.out.println(e.getMessage());
	}

	}
}


	

	

	