package at.sarah.StringHelper;

public class Palidrom {
    static boolean isTrue = false;
    public static void main(String[] args) {
         String wordInput = "Hell";
         checkForPalidrom(wordInput);

    }

    public static char[] checkForPalidrom (String word) {

        char[] convertToLetters = word.toCharArray();
        for (int adder = 0; adder < convertToLetters.length; adder++) {
            char Letters = convertToLetters[adder];
            System.out.print(Letters + " ");}

       /* if (word.equalsIgnoreCase("Help")){
            isTrue = true;
            System.out.println("Juupo");
        }
       else {
            System.out.println("Yay");
        }

       if (isTrue){
            System.out.println("isPalirdorm");
        }*/

       return convertToLetters;
    }

    public static void countLetters (char Letters){
        //System.out.println(convertToLetters.length);

    }
}
