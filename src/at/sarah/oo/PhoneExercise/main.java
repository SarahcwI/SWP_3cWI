package at.sarah.oo.PhoneExercise;

public class main {
    public static void main(String[] args) {
        PhoneFile file1 = new PhoneFile("File1", "jpg", 6);
        PhoneFile file2 = new PhoneFile("File2", "png", 4);

        SIMCard simCard = new SIMCard(35764,"848375889");


        SDCard sdCard = new SDCard(40);
        Camera camera = new Camera("700x788", sdCard);
        Phone phone = new Phone("red", camera, sdCard, simCard);


        sdCard.safeFile(file1);
        sdCard.safeFile(file2);

        sdCard.getAllFiles();
        System.out.println(phone.getFreeSpace());
        phone.takePicture();
        System.out.println("uwu");
        System.out.println(phone.getFreeSpace());

        phone.printAllFiles();

        phone.makeCall("9669405868");





    }
}
