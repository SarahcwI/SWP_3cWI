package at.sarah.oo.Camera;

public class main {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("GuteBilder", "3cWI");
        Lens lens = new Lens("5mm", m1);
        PictureFile pic1 = new PictureFile("uwu", "56,84,1020", "6MB");

        System.out.println(m1.getLand());




    }
}
