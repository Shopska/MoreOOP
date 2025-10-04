package ucu.edu.ua.lab_2;

import java.util.Random;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

public class CharacterFactory {
    private static Random RANDOM = new Random();

    private static final Class<?>[] CHARACTERS = {
            Hobbit.class,
            Elf.class,
            King.class,
            Knight.class
    };

    public Character createCharacter() {
        int idx = RANDOM.nextInt(CHARACTERS.length);
        try {
            return (Character) CHARACTERS[idx].getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create character", e);
        }
    }

    public static Character CreateRandomCharacterWithReflections() {
        // Скануємо пакет з героями
        Reflections reflections = new Reflections("ucu.edu.ua.lab_2");

        // Отримуємо всі підкласи Character через новий Scanners API
        Set<Class<? extends Character>> subTypes = 
            reflections.getSubTypesOf(Character.class);

        if (subTypes.isEmpty()) {
            throw new RuntimeException("No subclasses of Character found");
        }

        // Перетворюємо Set у List для зручного доступу по індексу
        List<Class<? extends Character>> list = new ArrayList<>(subTypes);

        int choice = RANDOM.nextInt(list.size());
        Class<? extends Character> characterClass = list.get(choice);

        try {
            return characterClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create character via reflection", e);
        }
    }
}
