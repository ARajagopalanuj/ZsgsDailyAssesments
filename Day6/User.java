/*‌
4. Design a travel booking system using two packages:`travel.booking – includes a class`Ticket with ticket ID, destination, and fare.`travel.user – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.*/


package travel.user;

public class User{

String userName ;
int age;

public void setUserName(String userName){
this.userName=userName;
}

public String getUserName(){
return userName;
}

public void setAge(int age){
this.age=age;
}

public int getAge(){
return age;
}

}
