package at.sarah.ExerciseCeaserEncryption;


public class CeaserEncryption {

    public static void main(String[] args) {
        String passwordInput = "Help";
        String result = Encryption.encryption(passwordInput);
        System.out.println(result);

    }





}


/*Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen verschoben (z.B. 2) a wird zu c, f wird zu h, z wird zu b usw.
Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String*/