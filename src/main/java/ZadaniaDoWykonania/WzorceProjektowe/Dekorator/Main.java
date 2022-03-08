package main.java.ZadaniaDoWykonania.WzorceProjektowe.Dekorator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Danie: ");
        Meal vegetablesMeal = new VegetablesMeal();
        vegetablesMeal.prepareMeal();

        System.out.println("\nDanie: ");
        Meal mainMealVegeChives = new ChivesMealDecorator(new VegetablesMeal());
        mainMealVegeChives.prepareMeal();

        System.out.println("\nDanie: ");
        Meal myCrazyDinner = new SauceMealDecorator(new SlicedParsleyMealDecorator(new PotatoMeal()));
        myCrazyDinner.prepareMeal();
    }
}
