package at.sarah.oo.Camera;

public class main {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("GuteBilder", "3cWI");
        Lens lens = new Lens("5mm", m1);
        PictureFile pic1 = new PictureFile("uwu", "56,84,1020", 6);
        SDCard sdCard1 = new SDCard(16);

        sdCard1.safePicture(pic1);
        System.out.println(m1.getLand());

        System.out.println( sdCard1.getFreeSpace());






    }
}
