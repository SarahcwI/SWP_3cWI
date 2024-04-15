package at.sarah.Test_TrafficController;

public class Passenger {
    private String firstname;
    private String lastname;

    public Passenger(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public void inform(String message) {
        System.out.println(this.firstname + " " + this.lastname + " has recieved the message: " + message);
    }

    public String getFirstname() {
        return firstname;
    }


    public String getLastname() {
        return lastname;
    }
}


