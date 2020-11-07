package Task04.animals;

import Task04.animalsEat.WorngFoodException;
import Task04.aviaries.Herbivores;
import Task04.aviaries.Predator;
import Task04.foods.*;

import java.util.Map;

/**
 * @autor by Shchepetkov
 */

public abstract class Animal<animal> {

    protected Map<String, animal> typeAnimalsMap;

    public void eat(Food food) {

        if (this instanceof Herbivores) {
            if (WorngFoodException.herbivoresEat(food) != null) {
                System.out.println("Eat " + type());
            }
        }

        if (this instanceof Predator) {
            if (WorngFoodException.predatorEat(food) != null) {
                System.out.println("Eat " + type());
            }
        }
    }

    public abstract String name();

    public abstract String type();

    public Animal getAnimal(String name) {
        Animal a = (Animal) typeAnimalsMap.get(name);
        if (a != null) {
            return a;
        }
        return new NullAnimal();
    }

    public void removeAnimal(String name) {
        typeAnimalsMap.remove(name);
        System.out.println("Животное удалено");
    }

}
