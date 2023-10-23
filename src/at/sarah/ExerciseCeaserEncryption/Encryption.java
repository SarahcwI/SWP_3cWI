package at.sarah.ExerciseCeaserEncryption;

public class Encryption {
    public static String encryption(String data) {
        char[] convertToLetters = data.toCharArray();
        char[] output = new char[convertToLetters.length];

        for (int adder = 0; adder < convertToLetters.length; adder++) {
            char Letters = convertToLetters[adder];
            if (Letters == 122 || Letters == 90) {
                Letters -= 26;
            }
            else {Letters += 2;}
            output[adder] = Letters;
        }
        return new String(output);

    }

}

