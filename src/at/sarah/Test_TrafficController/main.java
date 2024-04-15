package at.sarah.Test_TrafficController;

public class main {
    public static void main(String[] args) {
        Passenger pass1 = new Passenger("Henry", "Holla");
        Passenger pass2 = new Passenger("Helga", "Holland");
        Passenger pass3 = new Passenger("Herbert", "Holga");

        Position pos1 = new Position(10.0, 45.7);
        Position pos2 = new Position(50.0, 23.7);

        Plane plane1 = new Plane("Boing747", pos1);
        Plane plane2 = new Plane("Jet9", pos2);

        Traffic_Controller traf1 = new Traffic_Controller();


        plane1.addPassenger(pass1);
        plane1.addPassenger(pass2);

        plane2.addPassenger(pass3);

        traf1.addPlane(plane1);
        traf1.addPlane(plane2);


        traf1.informAllPeopleOnPlanes("The Plane is going to be an hour late");


    }
}
