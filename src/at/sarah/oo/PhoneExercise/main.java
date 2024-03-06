package at.sarah.oo.PhoneExercise;

public class main {
    public static void main(String[] args) {
        PhoneFile file1 = new PhoneFile("File1", "jpg", 6);
        PhoneFile file2 = new PhoneFile("File2", "png", 4);

        SDCard sdCard = new SDCard(40);

        System.out.println(file1.getAllInfo());

        sdCard.safeFile(file1);
        sdCard.safeFile(file2);

        sdCard.getAllFiles();

        System.out.println(sdCard.getFreeSpace());
    }
}
