package at.sarah.small_projects;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel_Bsp_Exercise_8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean isGameOnAndStarted = false;

        System.out.println("Bitte schreibe 'Start' um das Spiel zu beginnen");
        if (scanner.next().equalsIgnoreCase("Start")) {
            System.out.println("You started the game");
            isGameOnAndStarted = true;
        }



        while (isGameOnAndStarted) {
            for (int counter = 1; counter <= 2; counter++){
                int randomNumber1 = random.nextInt(1,6);
                if (counter == 1) {
                    System.out.println("Player 1 rolled " + randomNumber1);
                }
                else {
                    System.out.println("Player 2 rolled " + randomNumber1);
                }

                if


            }
           isGameOnAndStarted = false;

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