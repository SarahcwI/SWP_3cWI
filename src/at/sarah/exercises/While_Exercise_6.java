package at.sarah.exercises;
import java.util.Random;

public class While_Exercise_6 {
    public static void main(String[] args) {

        boolean isTrue = true;
        int memory = 0;


        while (isTrue) {

            Random random = new Random();
            int randomNumber = random.nextInt(10,31);

            if (randomNumber == 15 || randomNumber == 25) {
                isTrue = false;
            }

            else {memory += randomNumber;}
            System.out.println("To be added number: " + randomNumber);
            System.out.println(memory);
        }
    }
}

/*
* Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert. Das Programm soll die Zufallszahlen zusammenzählen.
* Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!*/