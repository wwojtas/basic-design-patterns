package main.java.ZadaniaDoWykonania.WzorceProjektowe.Dekorator;

public class ChivesMealDecorator extends MealDecorator{

    public ChivesMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChives();
    }

    private void addChives() {
        System.out.println("Dekoruję - szczypiorek ");
    }


}
