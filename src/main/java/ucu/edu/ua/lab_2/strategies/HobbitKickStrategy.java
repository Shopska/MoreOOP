package ucu.edu.ua.lab_2.strategies;
import ucu.edu.ua.lab_2.Character;
public class HobbitKickStrategy extends KickStrategy {
   public HobbitKickStrategy() {
   }

   public void kick(Character main, Character enemy) {
      System.out.println("Cry a lot!");
   }
}
