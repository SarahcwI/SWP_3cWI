package at.sarah.StringHelper;

public class CountAmountOfEachLetter {
    public static int countLetters (String inputWord, char letter){

        char[] letters = inputWord.toCharArray();
        int counterOfLetter = 0;

        for (int counter = 0; counter < letters.length ; counter++) {
            if (letters.equals(letter)){
                counterOfLetter++;
            }
        }
        return counterOfLetter;
    }
}
