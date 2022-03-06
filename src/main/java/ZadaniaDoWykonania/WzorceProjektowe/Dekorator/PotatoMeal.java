package main.java.ZadaniaDoWykonania.WzorceProjektowe.Dekorator;

public class PotatoMeal extends Meal{

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        System.out.println(" na bazie ziemniaków");
    }
}
