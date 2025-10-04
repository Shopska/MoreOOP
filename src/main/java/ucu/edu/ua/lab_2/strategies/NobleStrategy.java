package ucu.edu.ua.lab_2.strategies;


import java.util.Random;
import ucu.edu.ua.lab_2.Character;

public class NobleStrategy extends KickStrategy {
   private static final Random RANDOM = new Random();

   public NobleStrategy() {
   }

   public void kick(Character main, Character enemy) {
      int enemyHp = enemy.getHp();
      enemy.setHp(enemyHp - RANDOM.nextInt(main.getPower()));
   }
}