package Task04.animalsEat;

import Task04.foods.Food;

public class WorngFoodException {

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";


    public static HerbivoresEat herbivoresEat(Food food) {
        HerbivoresEat herbivoresEat = null;
        try {
            herbivoresEat = (HerbivoresEat) food;
        } catch (Exception e) {
            System.out.println(ANSI_RED + "Травоядное животное не может етсь еду для хищьников." + ANSI_RESET);
        }

        return herbivoresEat;
    }

    public static PredatorEat predatorEat(Food food) {
        PredatorEat predatorEat = null;
        try {
            predatorEat = (PredatorEat) food;
        } catch (Exception e) {
            System.out.println(ANSI_RED + "Хищьное животное не может етсь еду для травоядных" + ANSI_RESET);
        }

        return predatorEat;
    }
}
