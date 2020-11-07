package Task04.animals;

import Task04.aviaries.Predator;

public class Wolf extends Predator {
    private String name;

    public Wolf(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String type() {
        return "Wolf";
    }
}
