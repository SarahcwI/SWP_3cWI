package at.sarah.exercises;

public class Loops2_Exercise_5 {
    public static void main(String[] args) {

        int memory = 0;

        for(int i = 2; i <= 1000; i = i+2) {
            memory += i;
            System.out.println(memory);
        }
    }
}
