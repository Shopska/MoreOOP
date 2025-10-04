package ucu.edu.ua.lab_2;

public class Demo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();

        GameManager gm = new GameManager();
        gm.fight(c1, c2);
    }
}
