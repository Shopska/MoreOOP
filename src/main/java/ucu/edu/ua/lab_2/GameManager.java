package ucu.edu.ua.lab_2;

import java.util.Random;

public class GameManager {

    private static final Random RANDOM = new Random();

    public void fight(Character c1, Character c2) {
        System.out.println("=== Fight starts! ===");
        System.out.println(c1.getClass().getSimpleName() + " vs " + c2.getClass().getSimpleName() + "\n");

        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Round " + round + ":");

            // c1 атакує c2
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName() + " kicked " 
                               + c2.getClass().getSimpleName() + " | HP left: " + c2.getHp());

            if (!c2.isAlive()) {
                System.out.println("\n" + c2.getClass().getSimpleName() + " is dead. " 
                                   + c1.getClass().getSimpleName() + " wins!");
                break;
            }

            // c2 атакує c1
            c2.kick(c1);
            System.out.println(c2.getClass().getSimpleName() + " kicked " 
                               + c1.getClass().getSimpleName() + " | HP left: " + c1.getHp());

            if (!c1.isAlive()) {
                System.out.println("\n" + c1.getClass().getSimpleName() + " is dead. " 
                                   + c2.getClass().getSimpleName() + " wins!");
                break;
            }

            System.out.println(); // порожній рядок між раундами
            round++;
        }

        System.out.println("=== Fight ends ===\n");
    }
}
