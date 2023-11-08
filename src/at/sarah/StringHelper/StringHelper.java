package at.sarah.StringHelper;

public class StringHelper {

    public static boolean isPalidrom (String inputWord){
        System.out.println(inputWord);
        char[] letters = inputWord.toCharArray();


        for (int converter = 0; converter < letters.length; converter++ ){
            int currentLetter = letters[converter];
            System.out.println(currentLetter + " ");
            int lastLetter = currentLetter + letters.length ;
            if (currentLetter != lastLetter){
                return false;
            }
        }
        return true;
    }

}
