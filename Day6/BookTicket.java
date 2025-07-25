import travel.booking.Ticket;
import travel.user.User;

class BookTicket{


public static void main(String[] args){
User user=new User();
user.setUserName("Raja");
user.setAge(25);
Ticket ticket=new Ticket();
ticket.setTicketId(100);
ticket.setDestination("chennai");
ticket.setFare(253.00);


System.out.println("ticket id: "+ticket.getTicketId());
System.out.println("user name: "+user.getUserName());
System.out.println("user Age: "+ user.getAge());
System.out.println("Destination: "+ticket.getDestination());
System.out.println("amount: "+ticket.getFare());
}
}