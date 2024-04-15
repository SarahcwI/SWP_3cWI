package at.sarah.Test_TrafficController;

import java.util.ArrayList;

public class Traffic_Controller {
    private ArrayList<Plane> planes;

    public Traffic_Controller() {
        this.planes = new ArrayList<>();
    }


    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }


    public void informAllPeopleOnPlanes(String message) {
        for (int i = 0; i < planes.size(); i++) {
            planes.get(i).informAllPassengers(message);
        }
    }


    public void getAllPlanes() {
        for (int i = 0; i < planes.size(); i++) {
            System.out.println(planes.get(i).getAllInfo());

        }
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }
}
