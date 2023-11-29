package at.sarah.StringHelper;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Wort zum prüfen hier eingeben a: ");
        String wordInput = scanner.next();
        boolean isPalidrom = StringHelper.isPalidrom(wordInput);
        if (isPalidrom){
            System.out.println("Es funktioniert juppi");
        }
        if (!isPalidrom){
            System.out.println("Nein es funktiniert nicht");
        }

        System.out.println("Bitte Satz eingeben");
        String sentenceInput = scanner.next();
        System.out.println("Bitte Buchstabe eingeben");
        String inputLetter = scanner.next();
        char[] letter = inputLetter.toCharArray();
        char let = letter[0];

        int countAmountOfLetter = CountAmountOfEachLetter.countLetters(sentenceInput, let);
        System.out.println(countAmountOfLetter);

        int countLetters = CountAmountOfLetters.printAmountOfLetters(sentenceInput);
        System.out.println(countLetters);

    }
}
