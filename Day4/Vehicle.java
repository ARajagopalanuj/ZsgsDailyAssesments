/*1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.*/

class Vehicles{

	int mileage;
	double price;
}
class Car extends Vehicles{
	double cost;
	int warranty;
	int seat;
	String fuelType;
}

class Bike extends Vehicles{

	int gears;
	int cylinders;
	String coolingType;
	String wheelType;
	double tankSize;
}
class Audi extends Car{

	String model;
}
class Ford extends Car{
	String model;
}

class Bajaj extends Bike
{
	String model;
}
class Tvs extends Bike{
	String model;
}
class Main{

	public static void main(String[] args){

	Bajaj bajaj=new Bajaj();
	Tvs tvs=new Tvs();
	Audi audi=new Audi();
	Ford ford=new Ford();

	bajaj.mileage=100;
	bajaj.price=55000.00;
	bajaj.gears=4;
	bajaj.cylinders=2;
	bajaj.coolingType="air";
	bajaj.wheelType="aloys";
	bajaj.tankSize=12;

	tvs.mileage=70;
	tvs.price=65000.00;
	tvs.gears=5;
	tvs.cylinders=4;
	tvs.coolingType="liquid";
	tvs.wheelType="spokes";
	tvs.tankSize=10;

	audi.model="rrr";
	audi.cost=4500000.00;
	audi.warranty=5;
	audi.seat=4;
	audi.fuelType="Petrol";
	audi.mileage=30;
	audi.price=4000000.00;

	ford.model="ggg";
	ford.cost=4300000.00;
	ford.warranty=5;
	ford.seat=4;
	ford.fuelType="Diesel";
	ford.mileage=30;
	ford.price=4000000.00;

System.out.println("The bike model: bajaj");
System.out.println("The bike mileage: "+ bajaj.mileage);
System.out.println("The bike price: "+ bajaj.price);
System.out.println("The bike gears: "+ bajaj.gears);
System.out.println("The bike cylinders: "+ bajaj.cylinders);
System.out.println("the bike cooling type: :"+bajaj.coolingType);
System.out.println("the bike wheelType type: :"+bajaj.wheelType);
System.out.println("the bike tankSize: "+bajaj.tankSize);
System.out.println();
System.out.println("--------------------------------------------------------------------------------------------------------------");
System.out.println();

System.out.println("The bike model: TVS");
System.out.println("The bike mileage: "+ tvs.mileage);
System.out.println("The bike price: "+ tvs.price);
System.out.println("The bike gears: "+ tvs.gears);
System.out.println("The bike cylinders: "+ tvs.cylinders);
System.out.println("the bike cooling type: :"+tvs.coolingType);
System.out.println("the bike wheelType type: :"+tvs.wheelType);
System.out.println("the bike tankSize: "+tvs.tankSize);

System.out.println();
System.out.println("--------------------------------------------------------------------------------------------------------------");
System.out.println();

	

System.out.println("The car model: Audi");
System.out.println("The car mileage: "+ audi.mileage);
System.out.println("The car price: "+ audi.price);
System.out.println("The car cost: "+ audi.cost);
System.out.println("The car years ofwarranty: "+ audi.warranty);
System.out.println("the car No of seat: :"+audi.seat);

System.out.println("the car FuelType: "+audi.fuelType);

System.out.println();
System.out.println("--------------------------------------------------------------------------------------------------------------");
System.out.println();

	

System.out.println("The car model: Ford");
System.out.println("The car mileage: "+ ford.mileage);
System.out.println("The car price: "+ ford.price);
System.out.println("The car cost: "+ ford.cost);
System.out.println("The car years ofwarranty: "+ ford.warranty);
System.out.println("the car No of seat: :"+ford.seat);

System.out.println("the car FuelType: "+ford.fuelType);
	


	}

}
	

	