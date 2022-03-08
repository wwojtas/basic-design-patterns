package main.java.ZadaniaDoWykonania.WzorceProjektowe.Dekorator;

public class SlicedParsleyMealDecorator extends MealDecorator{

    public SlicedParsleyMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSlicedParsley();
    }

    private void addSlicedParsley(){
        System.out.println("Dekoruję - siekana pietruszka ");
    }
}
