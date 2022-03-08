package main.java.ZadaniaDoWykonania.WzorceProjektowe.Dekorator;

public class VegetablesMeal extends Meal{

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        System.out.println(" warzywa ");
    }
}
