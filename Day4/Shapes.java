/*5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.*/



class Shape{

	public void prints(){
	System.out.println("This is a shape");
	}
}

class Polygon extends Shape{

	public void prints(){
	System.out.println("This is a Polygon");
	}
}

class Rectangle extends Polygon{

	public void prints(){
	System.out.println("Rectangle is a Polygon");
	}
}

class Triangle extends Polygon{

	public void prints(){
	System.out.println("Triangle is a Polygon");
	}
}

class Square extends Rectangle{

	public void prints(){
	System.out.println("Square is a Polygon");
	}
}

class ShapeMain{

	public static void main(String[] args){
	
	Shape square=new Square();
	Shape triangle=new Triangle();
	Shape rectangle=new Rectangle();
	Shape polygon=new Polygon();
	Shape shape=new Shape();

	shape.prints();
	triangle.prints();
	rectangle.prints();
	polygon.prints();
	square.prints();
	}
}

	
