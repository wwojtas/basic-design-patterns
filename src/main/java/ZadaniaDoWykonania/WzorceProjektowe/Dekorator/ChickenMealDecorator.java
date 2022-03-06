package main.java.ZadaniaDoWykonania.WzorceProjektowe.Dekorator;

public class ChickenMealDecorator extends MealDecorator{

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }

    private void addChicken(){
        System.out.println("Do dania dodaję kurczaka");
    }
}
