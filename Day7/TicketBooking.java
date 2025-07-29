/*5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as Bus, Train, and Flight.
Define a common interface or abstract class`Ticket with a method`bookTicket() that each transportation mode must implement differently.
Create classes`BusTicket,`TrainTicket, and`FlightTicket that extend the abstract class or implement the interface.
Demonstrate runtime polymorphism by calling the`bookTicket() method using a reference of the base class/interface.*/

abstract class Ticket{
abstract void bookTicket();
public void getWelcome(){
System.out.println("Welcome to our ticket booking system");
}
}

class BusTicket extends Ticket{
private int ticketId;
private String customerName;
private String busNumber;



BusTicket(int ticketId,String customerName, String busNumber){
this.ticketId=ticketId;
this.customerName=customerName;
this.busNumber=busNumber;
}

public void bookTicket(){
System.out.println("your ticketId: "+ticketId);
System.out.println("customer name: "+customerName);
System.out.println("your bus number: "+busNumber);

}

}

class TrainTicket extends Ticket{
private int ticketId;
private String customerName;
private String trainNumber;
private String ticketType;



TrainTicket(int ticketId,String customerName, String trainNumber,String ticketType){
this.ticketId=ticketId;
this.customerName=customerName;
this.trainNumber=trainNumber;
this.ticketType=ticketType;
}

public void bookTicket(){
System.out.println("your ticketId: "+ticketId);
System.out.println("customer name: "+customerName);
System.out.println("your Train number: "+trainNumber);
System.out.println("your Ticket type: "+ticketType);

}

}
class FlightTicket extends Ticket{
private int ticketId;
private String customerName;
private String flightTime;



FlightTicket(int ticketId,String customerName, String flightTime){
this.ticketId=ticketId;
this.customerName=customerName;
this.flightTime=flightTime;
}

public void bookTicket(){
System.out.println("your ticketId: "+ticketId);
System.out.println("customer name: "+customerName);
System.out.println("your flight time: "+flightTime);

}

}


class Customer{

public static void main(String[] args){

BusTicket busticket=new BusTicket(1001,"Raja","tvl7878");
busticket.getWelcome();
busticket.bookTicket();


TrainTicket trainTicket=new TrainTicket(1001,"gopal","hs33333","Reservation");
trainTicket.getWelcome();
trainTicket.bookTicket();

FlightTicket flightTicket=new FlightTicket(1001,"Raja","11:00 PM");
flightTicket.getWelcome();
flightTicket.bookTicket();
}
}

