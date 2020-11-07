package Task04.animals;

import Task04.aviaries.Herbivores;

public class Horse extends Herbivores {

    private String name;

    public Horse(String name) {
        this.name = name;

    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String type() {
        return "Horse";
    }

}
