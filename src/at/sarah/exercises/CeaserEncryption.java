package at.sarah.exercises;

import java.util.Scanner;

public class CeaserEncryption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Passwort eingeben");
        String passwordReader = scanner.next();
        System.out.println(passwordReader);


        char[] convertToLetters = passwordReader.toCharArray();



        for (char letter : toLetters){
            System.out.print(letter + " ");
        }
        /*for (int letterCounter = 0; letterCounter < letters.length; letterCounter++) {
            System.out.println(letters[letterCounter]);

        }*/

    }


    public static String encryption(String passwordInput){


    }


}


/*Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen verschoben (z.B. 2) a wird zu c, f wird zu h, z wird zu b usw.
Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String*/