package at.sarah.small_projects;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel_Bsp_Exercise_8 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();

        boolean isGameOnAndStarted = false;

        int pointCounterPlayer = 0;
        int pointCounterComputer = 0;
        int roundCounter;

        System.out.println("Bitte schreibe 'Start' um das Spiel zu beginnen");
        if (scanner.next().equalsIgnoreCase("Start")) {
            isGameOnAndStarted = true;
        }


        while (isGameOnAndStarted) {
            for (roundCounter = 1; roundCounter <= 6; roundCounter++) {
                System.out.println("---------Round " + roundCounter + "---------");
                int randomNumber1 = random.nextInt(1, 6);
                int randomNumber2 = random.nextInt(1, 6);

                System.out.println("You rolled: " + randomNumber1);
                System.out.println("The Computer rolled: " + randomNumber2);
                System.out.println("---------------------------");

                if (randomNumber1 > randomNumber2) {
                    System.out.println("You won Round " + roundCounter + "!");
                    pointCounterPlayer++;
                }
                if (randomNumber1 < randomNumber2) {
                    System.out.println("The Computer won Round " + roundCounter + "!");
                    pointCounterComputer++;
                }
                if (randomNumber1 == randomNumber2) {
                    System.out.println("It's a tie!");
                }

                if (roundCounter == 1) {
                    scanner.nextLine();
                    scanner.nextLine();
                }
                if (roundCounter <= 5 && roundCounter != 1) {
                    scanner.nextLine();
                }
                if (roundCounter == 6) {
                    System.out.println(" ");
                }

            }

            if (pointCounterPlayer > pointCounterComputer) {
                int pointsLead = pointCounterPlayer - pointCounterComputer;
                System.out.println("Congrats! You won with total amount of " + pointCounterPlayer +
                        " points and a lead of " + pointsLead + " points!");
            } else {
                int pointsLead = pointCounterComputer - pointCounterPlayer;
                System.out.println("The Computer won with a total amount of " + pointCounterComputer + " points and a lead of " + pointsLead + " points!");
            }

            boolean result = showFinishDialog();
            if (!result){
                roundCounter=0;
            } else {
                break;
            }

        }


    }

    public static boolean showFinishDialog(){

        while (true) {
            System.out.println("If you wish to play again please type 'Abrakadabra' otherwise type 'Vanish'");
            String codeWord = scanner.next();
            if (codeWord.equalsIgnoreCase("Abrakadabra")) {
               return false;
            } else if (codeWord.equalsIgnoreCase("Vanish")) {
                //System.out.println("wooooosh...");

                return true;
            } else {
                System.out.println("invalid try again");
            }
        }

    }

}


/*
Round 1
Würfelt Spieler1 Player
würfelt Player
Runde 1 gewonnen + zum Counter

......

Counter wer mehr wer Spiel gewonnen hat
*/