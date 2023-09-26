package at.sarah.exercises;

import java.util.Scanner;

public class Bankomat_Bsp_Exercise_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOn = true;
        int balance = 0;

        System.out.println("**************");
        System.out.println("1 Einzahlen");
        System.out.println("2 Abheben");
        System.out.println("3 Kontostand");
        System.out.println("4 Beenden");
        System.out.println("**************");

        int selection = scanner.nextInt();

        while (isOn) {
            switch (selection){
                case 1:
                    System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten: ");
                    selection = scanner.nextInt();
                    balance += selection;
                    System.out.println("Sie haben " + balance + " Euro eingezahlt!");
                    selection = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Wie  viel möchten sie abheben? ");
                    selection = scanner.nextInt();
                    balance -= selection;
                    System.out.println("Sie haben " + selection + " Euro abgehoben!");
                    selection = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Ihr Kontostand beträgt: " + balance);
                    selection = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Maschine stoppt!");
                    isOn = false;
                    break;
            }
        }
    }
}
