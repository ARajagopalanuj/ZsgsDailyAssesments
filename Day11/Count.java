/*Write a Java program that reads a file and prints the number of lines, words, and characters.*/
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader; 

class Count{

	public static void main(String[] args){
	File file=new File("C:/Users/This Pc/Documents/Assignment/Day10/Account.txt");
	

	try(FileReader freader=new FileReader(file);

	BufferedReader breader=new BufferedReader(freader)){

	 int lineCount=0;
	int wordCount=0;
	int charCount=0;

	String line="";

	 while((line=breader.readLine())!=null){
		lineCount++;
		charCount+=line.length();
		
		String[] words=line.trim().split("\\s+");
		wordCount+=words.length;

	}

	System.out.println("Line count: "+lineCount);
	System.out.println("word count: "+wordCount);
	System.out.println("char count: "+charCount);

	}catch(Exception e){
	System.out.println(e.getMessage());
	}
	}
}