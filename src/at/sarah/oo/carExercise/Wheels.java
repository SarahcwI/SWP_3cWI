package at.sarah.oo.carExercise;

public class Wheels {
    public enum TYPE {Winter, Summer}
    private Wheels.TYPE TypeOfWheels; //
    private int size;
    private int position;

    public Wheels(TYPE TypeOfWheels, int size, int position) {
        this.size = size;
        this.position = position;
    }


    public TYPE getTypeOfWheels() {
        return TypeOfWheels;
    }

    public void setTypeOfWheels(TYPE typeOfWheels) {
        TypeOfWheels = typeOfWheels;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
