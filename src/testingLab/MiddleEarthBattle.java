package testingLab;

import java.util.Scanner;

public class MiddleEarthBattle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Good races values
        int hobbits = 1;
        int goodMen = 2;
        int dwarves = 3;
        int numenoreans = 4;
        int elves = 5;

        // Evil races values
        int evilMen = 2;
        int orcs = 2;
        int goblins = 2;
        int wargs = 3;
        int trolls = 5;

        // Ask for good army members
        System.out.println("Enter number of Hobbits:");
        int nHobbits = sc.nextInt();
        System.out.println("Enter number of Good Men:");
        int nGoodMen = sc.nextInt();
        System.out.println("Enter number of Dwarves:");
        int nDwarves = sc.nextInt();
        System.out.println("Enter number of Numenoreans:");
        int nNumenoreans = sc.nextInt();
        System.out.println("Enter number of Elves:");
        int nElves = sc.nextInt();

        // Calculate total strength of good army
        int goodStrength = hobbits * nHobbits + goodMen * nGoodMen
                + dwarves * nDwarves + numenoreans * nNumenoreans
                + elves * nElves;

        // Ask for evil army members
        System.out.println("Enter number of Evil Men:");
        int nEvilMen = sc.nextInt();
        System.out.println("Enter number of Orcs:");
        int nOrcs = sc.nextInt();
        System.out.println("Enter number of Goblins:");
        int nGoblins = sc.nextInt();
        System.out.println("Enter number of Wargs:");
        int nWargs = sc.nextInt();
        System.out.println("Enter number of Trolls:");
        int nTrolls = sc.nextInt();

        // Calculate total strength of evil army
        int evilStrength = evilMen * nEvilMen + orcs * nOrcs
                + goblins * nGoblins + wargs * nWargs
                + trolls * nTrolls;

        // Show results
        System.out.println("------ Results ------");
        System.out.println("Good strength: " + goodStrength);
        System.out.println("Evil strength: " + evilStrength);

        // Determine winner
        String result = calculateResult(goodStrength, evilStrength);
        System.out.println(result);

        sc.close();
    }

    public static String calculateResult(int goodStrength, int evilStrength) {
        if (goodStrength > evilStrength) {
            return "The light prevails in Middle-Earth, good wins!";
        } else if (evilStrength > goodStrength) {
            return "The light has fallen to darkness, evil wins!";
        } else {
            return "No one wins in this battle, it's a tie!";
        }
    }
}