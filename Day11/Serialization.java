/*5. Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
--->View All Products: Read all product objects from the file and display them.
--->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to the file.
--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and efficiently.*/
import java.io.Serializable;
import java.util.Scanner;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.EOFException;
import java.util.ArrayList;
class AppendableObjectOutputStream extends ObjectOutputStream{

	AppendableObjectOutputStream(OutputStream oos)throws IOException{
	super(oos);
	}
	
	protected void writeStreamHeader()throws IOException{
	reset();
	}
}



class Product implements Serializable{

	int productId;
	String name;
	double price;
	int quantity;

	public Product(int productId,String name,double price,int quantity){
	this.productId=productId;
	this.name=name;
	this.price=price;	
	this.quantity=quantity;
	}

	public String toString(){
	return "Product ID: "+productId+" Name: "+name+" Price: "+price+" quantity: "+quantity;
	}
}





class Main{

	public static String fileName;

	public static void main(String[] args)throws Exception{

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the file name");

	fileName=scan.nextLine();
	
	System.out.println("Add product --> enter 1 \nview All product--> enter 2 \nSearch product--> enter 3\nupdate product --> enter 4 \ndelete product-->enter 5");
	try{
	int choice=scan.nextInt();

	switch(choice){
		case 1:
			System.out.println("Enter the product Id");
			{
			int id=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the product name");
			String name=scan.nextLine();
			System.out.println("Enter the product price per kg: ");
			double price= scan.nextDouble();
			
			System.out.println("Enter the quantity:  ");
			int quantity=scan.nextInt(); 
			scan.nextLine();
			Product product=new Product(id,name,price,quantity);
			addProduct(product);
			}
			break;
		case 2:
			viewProduct();
			break;
		case 3:
			System.out.println("Enter the search product  id");
			int pId=scan.nextInt();
			scan.nextLine();
			searchProduct(pId);
			break;
		case 4: 
			System.out.println("Enter product Id");
			{
			int id=scan.nextInt();
			System.out.println("Enter 1 update rate\nenter 2 update quantity");
			int n=scan.nextInt();
			if(n==1){
			System.out.println("Enter the new rate");
			double rate=scan.nextDouble();
			updateProduct(id,rate);
			}else if(n==2){
			System.out.println("Enter the new quantity");
			int quantity=scan.nextInt();
			updateProduct(id,quantity);
			}else{
			System.out.println("Invalid choice");
			}
			
			}		
				
			break;
		case 5:
			System.out.println("Enter the delete product  id");
			int dId=scan.nextInt();
			scan.nextLine();
			deleteProduct(dId);
			break;
		default:
			System.out.println("Enter the current option");
			break;
		}
		}catch(Exception e){
		System.out.println(e.getMessage());
		}


	}

	public static void addProduct(Product product)throws IOException{

	File file=new File(fileName);
	FileOutputStream fos=new FileOutputStream(file,true);

	ObjectOutputStream oos=null;

	if(file.length()==0){
	oos=new ObjectOutputStream(fos);
	}else{
	oos=new AppendableObjectOutputStream(fos);
	}
	

	oos.writeObject(product);
	oos.flush();
	oos.close();
	
	System.out.println("Succesfully Added");
 
	}

	public static void viewProduct(){

	try(FileInputStream fis=new FileInputStream(fileName);
	ObjectInputStream ois=new ObjectInputStream(fis)){
	 
	while(true){
	Product p=(Product)ois.readObject();
	System.out.println(p);
	}
	}catch(Exception e){
	System.out.println(e.getMessage());
	}

	}

	public static void searchProduct(int id)throws Exception{

		try(FileInputStream fis=new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fis)){
			Boolean found=true;
		while(true){
		Product p=(Product)ois.readObject();
		if(p.productId==id){
		System.out.println(p.toString());
		found=false;
		break;
		}
		}
		}
		catch(EOFException e){
		System.out.println("product not found");
		}
		

	}


	public static void updateProduct(int id,double rate)throws Exception{
	ArrayList<Product>list=new ArrayList<>();
	boolean val=false;
	try(FileInputStream fis=new FileInputStream(fileName);
	    ObjectInputStream ois=new ObjectInputStream(fis)){
		
	
		
		while(true){
		Product p=(Product)ois.readObject();
		if(p.productId==id){
		val=true;
		p.price=rate;
		}
		list.add(p);
		}
				
	}catch(EOFException e){
		if(val){
		try(FileOutputStream fos=new FileOutputStream(fileName);
	    ObjectOutputStream oos=new ObjectOutputStream(fos)){
		for(Product p:list){
		oos.writeObject(p);
		}
		oos.flush();	
		System.out.println("updated Succefully");


		
		}catch(Exception y){
		System.out.println(y.getMessage());
		}
		}else{
		System.out.println("Product Not found");
		}
	}

	
	


	}
	public static void updateProduct(int id,int quantity)throws Exception{

	
	ArrayList<Product>li=new ArrayList<>();
	boolean vl=false;
	try(FileInputStream fis=new FileInputStream(fileName);
	    ObjectInputStream ois=new ObjectInputStream(fis)){
		
	
		
		while(true){
		Product p=(Product)ois.readObject();
		if(p.productId==id){
		vl=true;
		p.quantity=quantity;
		}
		li.add(p);
		}
				
	}catch(EOFException e){
		if(vl){
		try(FileOutputStream fos=new FileOutputStream(fileName);
	    ObjectOutputStream oos=new ObjectOutputStream(fos)){
		for(Product p:li){
		oos.writeObject(p);
		}
		oos.flush();	
		System.out.println("updated Succefully");


		
		}catch(Exception y){
		System.out.println(y.getMessage());
		}
		}else{
		System.out.println("Product Not found");
		}
	}

	


	}
	public static void deleteProduct(int id)throws Exception{
	ArrayList<Product>plist=new ArrayList<>();
	boolean bvl=false;
	try(FileInputStream fis=new FileInputStream(fileName);
	    ObjectInputStream ois=new ObjectInputStream(fis)){
		
	
		
		while(true){
		Product p=(Product)ois.readObject();
		if(p.productId!=id){
		plist.add(p);	
		}else{
		bvl=true;
		}
		}
				
	}catch(EOFException e){
		if(bvl){
		try(FileOutputStream fos=new FileOutputStream(fileName);
	    ObjectOutputStream oos=new ObjectOutputStream(fos)){
		for(Product p:plist){
		oos.writeObject(p);
		}
		oos.flush();	
		System.out.println("updated Succefully");


		
		}catch(Exception y){
		System.out.println(y.getMessage());
		}
		}else{
		System.out.println("Product Not found");
		}
	}

	}

	


}




	