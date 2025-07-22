/*5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.*/

import java.util.*;

class Store{

private static String storeName;
private static String storeLocation;
static List<Product>list=new ArrayList<>();

  static void setDetails(String name,String location){
	storeName=name;
	storeLocation=location;
	}


static void display(){
	System.out.println("Store name" + storeName);
	System.out.println("Store Location" + storeLocation);
	} 

	void addProduct(Product product){

	list.add(product);
		
	}
	static void displayProduct(){

	for(Product p:list){
	display();
	p.displayProduct();
	System.out.println();

	}
	
	}
	

	}

class Product{
private int productId;
private String productName;
private double price;
private int  quantity;

	Product(int productId,String productName,double price,int quantity){

	this.productId=productId;
	this.productName=productName;
	this.price=price;
	this.quantity=quantity;	

	}
	void displayProduct(){
	System.out.println("product id: "+ productId);
	System.out.println("product Name: "+ productName);
	System.out.println("product Price: "+ price);
	System.out.println("product Quantity: "+ quantity);
	}

public static void main(String[] args){

Store store=new Store();

Product product1=new Product(1001,"sugar",50.00,1000);
Product product2=new Product(1002,"salt",10.00,1000);
Product product3=new Product(1003,"rice",40.00,1000);

store.setDetails("Super Market","Tirunelveli");

store.addProduct(product1);

store.addProduct(product2);

store.addProduct(product3);

store.displayProduct();

}
}

	
