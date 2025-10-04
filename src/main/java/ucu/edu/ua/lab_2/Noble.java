package ucu.edu.ua.lab_2;
import ucu.edu.ua.lab_2.strategies.*;
import java.util.Random;
public class Noble extends Character {
   private static final Random RANDOM = new Random();

   public Noble(int minPower, int maxPower, int minHp, int maxHp) {
      super(RANDOM.nextInt(maxPower - minPower) + minPower, RANDOM.nextInt(maxHp - minHp) + minHp, new NobleStrategy());
   }
}

