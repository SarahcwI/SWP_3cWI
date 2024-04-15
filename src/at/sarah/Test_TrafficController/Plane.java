package at.sarah.Test_TrafficController;

import java.util.ArrayList;

public class Plane {
    private String name;
    private Position position;
    private ArrayList<Passenger> passengers;

    public Plane(String name, Position position) {
        this.name = name;
        this.position = position;
        this.passengers = new ArrayList<>();
    }


    public String getAllInfo() {
        return "Name: " + this.name + "Position: " + getPosition();
    }

    public void informAllPassengers(String message) {
        for (int i = 0; i < passengers.size(); i++) {
            passengers.get(i).inform(message);

        }
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }


    public String getName() {
        return name;
    }

    public String getPosition() {
        return position.getPosition();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}
