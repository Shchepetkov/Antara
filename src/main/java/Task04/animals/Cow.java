package Task04.animals;

import Task04.aviaries.Herbivores;

public class Cow extends Herbivores {

    private String name;

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String type() {
        return "Cow";
    }

}
