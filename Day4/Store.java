/*6. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated.*/

import java.util.ArrayList;

class Store{
	private static String name;
	private static String location;
	
	ArrayList<Product>list=new ArrayList<>();	

	public void setStoreDetails(String name,String location){

	this.name=name;
	this.location=location;

	}

	public void displayStoreDetails(){
	
	System.out.println("Store name:     "+name);
	System.out.println("Store location: "+location);

	}

	public void addProduct(Product product){
		list.add(product);
	}

	public void displayAllProducts(){
	int count=0;
	for(Product product:list){
	System.out.println(++count+"\t"+product.name);
	}
	System.out.println("-------------------------------------------------");

	}
}

class Product{
private int id;
String name;
private double price;
private int quantity;

	Product(int id,String name,double price, int quantity){
	this.id=id;
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	}

	public void displayProduct(){
	System.out.println("Product Id: "+id);
	System.out.println("Product name: "+name);
	System.out.println("Product price: "+price);
	System.out.println("Product Quantity: "+quantity);
	}

	public static void main(String[] args){
	

	Store store=new Store();

	store.setStoreDetails("RRR super market","Tirunelveli");

	Product product1=new Product(1001,"sugar",100.00,100);

	Product product2=new Product(1002,"tea powder",200.00,20);

	Product product3=new Product(1003,"ginger",50.00,100);

	store.addProduct(product1);
	
	store.addProduct(product2);

	store.addProduct(product3);

	store.displayAllProducts();
	
	product1.displayProduct();

	product2.displayProduct();

	product3.displayProduct();
	
	}
}
	
	

	

	





