package at.sarah.ExerciseCeaserEncryption;

public class Decryption {
    public static String decryption(String input){
        char[] convertToLetters = input.toCharArray();
        char [] output = new char[convertToLetters.length];

        for (int taker = 0; taker < convertToLetters.length; taker++) {
            char Letters = convertToLetters[taker];
            if (Letters == 98 || Letters == 66) {
                Letters += 22;
            }
           else if (Letters == 97 || Letters == 65) {
                Letters += 24;
            }
            else {Letters -= 2;}

            output[taker] = Letters;
        }
        return new String(output);
    }
}
