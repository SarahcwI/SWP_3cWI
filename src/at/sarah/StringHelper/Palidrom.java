package at.sarah.StringHelper;

public class Palidrom {
    static boolean isTrue = false;
    public static void main(String[] args) {
        String wordInput = "Help";
         checkForPalidrom(wordInput);
        System.out.println(wordInput);

    }


    public static void checkForPalidrom (String word) {

        char[] convertToLetters = word.toCharArray();
        for (int adder = 0; adder < convertToLetters.length; adder++) {
            char Letters = convertToLetters[adder];
            System.out.print(Letters + " ");}

        System.out.println(convertToLetters);
        if (word.equalsIgnoreCase("Help")){
            isTrue = true;
            System.out.println("Juupo");
        }
        if (isTrue){
            System.out.println("isPalirdorm");
        }
    }
}
