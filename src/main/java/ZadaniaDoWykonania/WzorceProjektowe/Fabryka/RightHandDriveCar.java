package main.java.ZadaniaDoWykonania.WzorceProjektowe.Fabryka;

public class RightHandDriveCar implements FactoryOfCars{

    @Override
    public Ford createFord(FordModel fordModel) {
        switch (fordModel) {
            case CMAX:
                return new Ford(1.9f,"ON-r",2022);
            case FOCUS:
                return new Ford(1.8f,"Gasoline",2022);
            default:
                throw new UnsupportedOperationException("Nieznany typ ");
        }
    }

    @Override
    public BMW createBmw(BMWModel bmwModel) {
        switch (bmwModel) {
            case X6:
                return new BMW(2.5f,"ON-r",2022);
            case E60:
                return new BMW(3.0f,"Gasoline",2022);
            default:
                throw new UnsupportedOperationException("Nieznany typ ");
        }
    }

    @Override
    public void getSteringWheelPosition() {
        System.out.println("RIGHT");

    }
}
