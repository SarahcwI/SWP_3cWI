package at.sarah.StringHelper;

public class StringHelper {

    public static boolean isPalidrom (String inputWord) {
        System.out.println(inputWord);
        char[] letters = inputWord.toCharArray();

        for (int converter = 0; converter < letters.length/2; converter++) {
            int currentLetter = letters[converter];
            //System.out.println(currentLetter + " ");
            int lastLetter =  letters[letters.length - converter - 1];
            if (currentLetter != lastLetter) {
                System.out.println("Hallo");
                return false;
            }




        }
        return true;
    }
}
