package ucu.edu.ua.lab_2;

import ucu.edu.ua.lab_2.strategies.HobbitKickStrategy;

public class Hobbit extends Character {
   public Hobbit() {
      super(0, 3, new HobbitKickStrategy());
   }
}
