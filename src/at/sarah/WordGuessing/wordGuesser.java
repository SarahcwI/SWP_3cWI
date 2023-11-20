package at.sarah.WordGuessing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class wordGuesser {
    public static void main(String[] args) {
        String[] wordsToGuess = {"Alfredo", "Johannes", "Jurgen", "Tafel"};

        Random random = new Random();
        int randomNumber = random.nextInt(wordsToGuess.length);

        System.out.println(wordsToGuess[randomNumber]);
    }
}
