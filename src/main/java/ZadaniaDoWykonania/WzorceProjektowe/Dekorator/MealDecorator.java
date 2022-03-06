package main.java.ZadaniaDoWykonania.WzorceProjektowe.Dekorator;

abstract public class MealDecorator extends Meal{

    protected Meal meal;

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}
