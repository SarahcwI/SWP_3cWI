package at.sarah.ExerciseCeaserEncryption;


import java.util.Scanner;

public class CeaserEncryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me Password: ");
        String passwordInput = scanner.next();

        String encrypted = Encryption.encryption(passwordInput);
        System.out.println("New Password " + encrypted);
        String decrypted = Decryption.decryption(encrypted);
        System.out.println("Old Password " + decrypted);


    }
}


/*Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen verschoben (z.B. 2) a wird zu c, f wird zu h, z wird zu b usw.
Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String*/

