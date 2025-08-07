/*2. Write a Menu driven Java program 
a) to read content from the user and write it into another file and 
b) from the file to another file 
c) to modify the content of a file 
d) to search for a particular word in a file and display how many times it appears 
e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.*/
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.PrintWriter;
class FileOperations{

	public static void main(String[] args){

	System.out.println("Enter the operation ");

	System.out.println("choose 1 write a file\nEnter 2 copy file \nEnter 3 modify file \nEnter 4 search file \nEnter 5 convert to csv file ");

	Scanner scan=new Scanner(System.in);
try{
	int n=scan.nextInt();

	switch(n){

		case 1:
			write();
			break;

		case 2:

			copy();
			break;

		case 3:
			modify();
			break;

		case 4:

			search();
			break;

		case 5: 
			convertToCsv();
			break;

		default :

			System.out.println("exit......");
			break;
			

	
	}
}catch(Exception e){
System.out.println(e.getMessage());

}
	

}
	public static void write()throws Exception{

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the file path with file name");
	String path=scan.nextLine();
	FileWriter fwriter=null;
	try{
	File file=new File(path);

	 fwriter=new FileWriter(file,true);

	System.out.println("Enter exit to are you finished the write");

	String line=scan.nextLine();

	while(!line.equalsIgnoreCase("exit")){
	fwriter.write(line);
	line=scan.nextLine();	
	}
System.out.println("Succesfully copied");
	fwriter.flush();
	
	}finally{
	fwriter.close();
	}
	

	

	}


public static void copy()throws Exception{
	Scanner scan=new Scanner(System.in);

	FileWriter fwriter=null;
	FileReader freader=null;
	BufferedReader breader=null;
	PrintWriter pwriter=null;

try{
	System.out.println("Enter the source file");
	String source=scan.nextLine();
	System.out.println("Enter the write file");
	String  wroteFile=scan.nextLine();

	freader=new FileReader(source);
	breader=new BufferedReader(freader);
	fwriter=new FileWriter(wroteFile,true);
	pwriter=new PrintWriter(fwriter);
	String line;
	while((line=breader.readLine())!=null){
	pwriter.write(line);
	}
	}finally{
	fwriter.close();
	pwriter.close();
	freader.close();
	breader.close();
	}

	}

public static void modify()throws Exception{

	Scanner scan=new Scanner(System.in);
	



	FileWriter fwriter=null;

	PrintWriter pwriter=null;
	
	FileReader freader=null;
	
	BufferedReader breader=null;

	try{
	System.out.println("Enter the source file");
	String source=scan.nextLine();

	

	freader=new FileReader(source);
	breader=new BufferedReader(freader);

	StringBuilder sb=new StringBuilder();

	String line;
	
	System.out.println("Enter the word to change");

	String old=scan.nextLine();

	System.out.println("Enter the new word");

	String newWord=scan.nextLine();
		

	while((line=breader.readLine())!=null){
	line=line.replace(old,newWord);
	sb.append(line).append("\n");
	}
	breader.close();
	
	fwriter=new FileWriter(source);
	pwriter=new PrintWriter(fwriter);
		
	pwriter.write(sb.toString());	

	pwriter.flush();
	System.out.println("Succesfully modified");
	}finally{
	pwriter.close();
	fwriter.close();
	freader.close();
	}

	}

public static void search()throws Exception{
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the source file or path");
	
	String source=scan.nextLine();
	
	System.out.println("give the word to search");

	String word=scan.nextLine();

	FileReader freader=null;

	BufferedReader breader=null;


	try{

	freader=new FileReader(source);

	breader=new BufferedReader(freader);

	String line;
	int count=0;
	while((line=breader.readLine())!=null){
	String[] arr=line.split("\\s+");
	for(String s:arr){
	if(s.equals(word)){
	count++;
	}
	}
	}
	System.out.println("The number of "+ word+" "+count);
	}finally{

	breader.close();
	freader.close();
	}
	}
	

public static void convertToCsv()throws Exception{

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the textFile path or name");
	String textFile=scan.nextLine();

	System.out.println("Enter the csv file path and file name with extension");
	String csvPath=scan.nextLine();
	
	FileWriter fwriter=null;

	PrintWriter pwriter=null;
	
	FileReader freader=null;
	
	BufferedReader breader=null;

	try{

	freader =new FileReader(textFile);
	breader=new BufferedReader(freader);

	fwriter=new FileWriter(csvPath);
	pwriter=new PrintWriter(fwriter);

	String line;

	while((line=breader.readLine())!=null){
	pwriter.println(line);
	
	pwriter.flush();
	
	}
	System.out.println("conver to csv files succesfully");
	}finally{
	pwriter.close();
	fwriter.close();
	breader.close();
	freader.close();
	}
	}
	

	
	

	
	



}