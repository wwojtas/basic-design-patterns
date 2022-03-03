package main.java.ZadaniaDoWykonania.WzorceProjektowe.Fabryka;

public class LeftHandDriveCar implements FactoryOfCars{

    @Override
    public Car createFord(FordModel fordModel) {
        switch (fordModel) {
            case CMAX:
                return new Ford(1.9f,"ON-l",2020);
            case FOCUS:
                return new Ford(1.8f,"Gasoline",2021);
            default:
                throw new UnsupportedOperationException("Nieznany typ ");
        }
    }

    @Override
    public Car createBmw(BMWModel bmwModel) {
        switch (bmwModel) {
            case X6:
                return new BMW(2.5f,"ON-l",2021);
            case E60:
                return new BMW(3.0f,"Gasoline",2022);
            default:
                throw new UnsupportedOperationException("Nieznany typ ");
        }
    }

    @Override
    public void getSteringWheelPosition() {
        System.out.println("LEFT");
    }


}
