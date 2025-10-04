package ucu.edu.ua.lab_2.strategies;
import ucu.edu.ua.lab_2.Character;

public class ElfKickStrategy extends KickStrategy {
   public ElfKickStrategy() {
   }

   public void kick(Character main, Character enemy) {
      if (enemy.getHp() < main.getHp()) {
         enemy.setHp(0);
      } else {
         enemy.setHp(enemy.getHp() - 1);
      }

   }
}
