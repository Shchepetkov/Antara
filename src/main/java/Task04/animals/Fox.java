package Task04.animals;

import Task04.aviaries.Predator;

public class Fox extends Predator {

    private String name;

    public Fox(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String type() {
        return "Fox";
    }
}
