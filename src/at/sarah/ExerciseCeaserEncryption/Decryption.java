package at.sarah.ExerciseCeaserEncryption;

public class Decryption {
    public static String decryption(String input){
        char[] convertToLetters = input.toCharArray();
        char [] output = new char[convertToLetters.length];

        for (int taker = 0; taker < convertToLetters.length; taker++) {
            char Letters = convertToLetters[taker];
            Letters -= 2;
            output[taker] = Letters;
        }
        return new String(output);
    }
}
