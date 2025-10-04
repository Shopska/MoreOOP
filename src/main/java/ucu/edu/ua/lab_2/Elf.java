package ucu.edu.ua.lab_2;

import ucu.edu.ua.lab_2.strategies.ElfKickStrategy;

public class Elf extends Character {
   public Elf() {
      super(10, 10, new ElfKickStrategy());
   }
}


