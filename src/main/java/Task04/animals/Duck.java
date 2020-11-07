package Task04.animals;

import Task04.aviaries.Herbivores;

public class Duck extends Herbivores {

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String type() {
        return "Duck";
    }

}
