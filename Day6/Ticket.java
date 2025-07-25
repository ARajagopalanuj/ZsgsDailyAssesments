package travel.booking;

public class Ticket{

private int ticketId;
private String destination;
private double fare;

public void setTicketId(int ticketId){
this.ticketId=ticketId;
}

public int getTicketId(){
return ticketId;
}

public void setDestination(String destination){
this.destination=destination;
}

public String getDestination(){
return destination;
}

public void setFare(double fare){
this.fare=fare;
}

public double getFare(){
return fare;
}
}

