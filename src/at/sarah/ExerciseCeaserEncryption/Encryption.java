package at.sarah.ExerciseCeaserEncryption;

public class Encryption {
    public static String encryption(String data) {
        char[] convertToLetters = data.toCharArray();
        char[] output = new char[convertToLetters.length];

        for (int adder = 0; adder < convertToLetters.length; adder++) {
            char Letters = convertToLetters[adder];
            if (Letters == 121 || Letters == 89) {
                Letters -= 24;
            }
           else if (Letters == 122 || Letters == 90) {
                Letters -= 24;
            }
            else {Letters += 2;}
            output[adder] = Letters;
        }
        return new String(output);

    }

}

