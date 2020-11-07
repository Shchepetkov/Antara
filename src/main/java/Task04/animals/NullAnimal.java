package Task04.animals;

import Task04.foods.Food;

public class NullAnimal extends Animal {
    @Override
    public void eat(Food food) {
        System.out.println("Животного нет в загоне");
    }

    @Override
    public String name() {
        return "NULL";
    }

    @Override
    public String type() {
        return "NULL";
    }
}
