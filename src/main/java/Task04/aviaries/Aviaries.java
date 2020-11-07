package Task04.aviaries;

import Task04.animals.Animal;
import Task04.foods.Food;
import Task04.interfeices.Feedable;

import java.util.HashMap;

public class Aviaries<T extends Animal> extends Animal<T> implements Feedable {

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";

    private int maxAnimal;

    public Aviaries(int maxAnimal) {
        typeAnimalsMap = new HashMap<>();
        this.maxAnimal = maxAnimal;
    }

    public void addAnimal(T animal) {
        if (typeAnimalsMap.size() < maxAnimal) {
                typeAnimalsMap.put(animal.name(), animal);
                System.out.println(ANSI_GREEN + "Животное "
                        + animal.type()
                        + " добавлено. "
                        + "Имя "
                        + animal.type() + ": "
                        + animal.name() + "." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Загон переполнен вы не можете добавить животное " + animal.type() + "." + ANSI_RESET);
        }
    }

    @Override
    public String name() {
        return "Клетка";
    }

    @Override
    public String type() {
        return "Клетка";
    }

    @Override
    public void feedAll(Food food) {

        for (T h : typeAnimalsMap.values()) {
            h.eat(food);
        }
    }

}