package at.sarah.StringHelper;

public class StringHelper {

    public static boolean isPalidrom (String inputWord){
        System.out.println(inputWord);
        char[] letters = inputWord.toCharArray();
        boolean isTrue = false;

        for (int converter = 0; converter < letters.length; converter++ ){
            char currentLetter = letters[converter];
            System.out.println(currentLetter + " ");
            if (currentLetter == letters.length - 1){
               isTrue = true;
                System.out.println("Yuppi");
            }
            else {
                System.out.println("ono");}
        }
        return isTrue;
    }

}
