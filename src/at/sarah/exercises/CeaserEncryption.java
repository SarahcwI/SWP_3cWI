package at.sarah.exercises;

import java.util.Random;

public class CeaserEncryption {
    public static void main(String[] args) {
        Random random = new Random();

      String[] words = {"Ich", "brauche", "Hilfe", "Ohnein"};

        for (int arrayFieldSelector = 0; arrayFieldSelector < words.length ; arrayFieldSelector++) {
            int randomNumber = random.nextInt(0,words.length);
            System.out.println(words[randomNumber]);
        }




    }




}


/*Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen verschoben (z.B. 2) a wird zu c, f wird zu h, z wird zu b usw.
Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String*/