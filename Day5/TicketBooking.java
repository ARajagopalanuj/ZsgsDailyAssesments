/*4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.
*/
import java.util.Scanner;
class TicketBooking{


void ticketBooking(){

}

}
class Bus extends TicketBooking{

void ticketBooking(){
System.out.println("your bus ticket is booked");
}
}

class Train extends TicketBooking{

void ticketBooking(){
System.out.println("your Train ticket is booked");
}
}

class Flight extends TicketBooking{

void ticketBooking(){
System.out.println("your Flight ticket is booked");
}
}

class Ticket{

public static void main(String[] args){
Scanner scan =new Scanner(System.in);
System.out.println("if you choose buse enter 1 \n if you choose train enter 2 \n if you choose flight enter 3");
int n=scan.nextInt();
switch(n){

case 1:
	TicketBooking bus=new Bus();
	bus.ticketBooking();
	break;

case 2: 
	TicketBooking train=new Train();
	train.ticketBooking();
	break;

case 3:
	TicketBooking flight=new Flight();
	flight.ticketBooking();
	break;
default:
	System.out.println("value not match");
	break;
}
}
}



 
