package at.sarah.small_projects;

import java.util.Scanner;

public class Bankomat_Bsp_Exercise_7 {
    public static void main(String[] args) {
        printLines();

        boolean isMaschineRunning = true;
        int accountBalance = 0;
        Scanner scanner = new Scanner(System.in);
        int selectionOfCase = scanner.nextInt();

        while (isMaschineRunning) {
            switch (selectionOfCase) {
                case 1:
                    System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten: ");
                    selectionOfCase = scanner.nextInt();
                    accountBalance += selectionOfCase;
                    System.out.println("Sie haben " + accountBalance + " Euro eingezahlt!");
                    selectionOfCase = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Wie  viel möchten sie abheben? ");
                    selectionOfCase = scanner.nextInt();
                    accountBalance -= selectionOfCase;
                    System.out.println("Sie haben " + selectionOfCase + " Euro abgehoben!");
                    selectionOfCase = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Ihr Kontostand beträgt: " + accountBalance);
                    selectionOfCase = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Maschine stoppt!");
                    isMaschineRunning = false;
                    scanner.close();
                    break;
            }
        }
    }
    public static void printLines (){
        System.out.println("**************");
        System.out.println("1 Einzahlen");
        System.out.println("2 Abheben");
        System.out.println("3 Kontostand");
        System.out.println("4 Beenden");
        System.out.println("**************");
    }
}
