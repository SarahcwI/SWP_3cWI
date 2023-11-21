package at.sarah.WordGuessing;
import java.util.Arrays;
import java.util.Random;

public class wordGuesser {
    public static void main(String[] args) {
        String[] wordsToGuess = {"Alfredo", "Johannes", "Jurgen", "Tafel"};
        Random random = new Random();
        int indexOfWordToGuess = random.nextInt(wordsToGuess.length);
        System.out.println(wordsToGuess[indexOfWordToGuess]);

        char[] eachLetter = wordsToGuess[indexOfWordToGuess].toCharArray();
        char[] output = Arrays.copyOf(eachLetter, eachLetter.length);
        for (int converter = 0; converter < eachLetter.length; converter++) {

            output[converter] = '*';

        }
        System.out.println(output);

    }
}

