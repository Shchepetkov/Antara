package Task04;

import Task04.animals.*;
import Task04.aviaries.Aviaries;
import Task04.aviaries.Herbivores;
import Task04.aviaries.Predator;
import Task04.foods.Corn;
import Task04.foods.Meat;

public class Main4 {

    /**
     * @autor by Shchepetkov
     */

    public static void main(String[] args) {

        Aviaries<Herbivores> h = new Aviaries<>(4);
        Aviaries<Predator> p = new Aviaries<>(3);

        h.addAnimal(new Cow("Корова"));
        h.addAnimal(new Duck("Утка"));
        h.addAnimal(new Horse("Лошадь"));
        h.addAnimal(new Horse("Лошадь2"));

        p.addAnimal(new Tiger("Тигр"));
        p.addAnimal(new Fox("Лиса"));
        p.addAnimal(new Wolf("Волк"));

        h.removeAnimal("Лошадь2");        //Животное удалено
        h.getAnimal("Корова").eat(new Meat());  // Травоядное животное не может етсь еду для хищьников.
        h.getAnimal("Утка").eat(new Corn());    // eat Duck
        h.getAnimal("Лошадь").eat(new Corn());  // eat Horse

        p.getAnimal("Корова").eat(new Meat());  // Животного нет в загоне
        p.getAnimal("Лиса").eat(new Corn());    // Хищьное животное не может етсь еду для травоядных
        p.getAnimal("Волк").eat(new Corn());    // Хищьное животное не может етсь еду для травоядных

        p.feedAll(new Meat());
    }
}