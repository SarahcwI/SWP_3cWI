package at.sarah.oo.PhoneExercise;

public class SIMCard {
    private int id;
    private String number;

    public SIMCard(int id, String number) {
        this.id = id;
        this.number = number;
    }


    public String getSimInfo(){
        return "id: " + id + " Number: " + number;
    }


    public String doCall(){
        return "dialing number ...";
    }


    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
}
