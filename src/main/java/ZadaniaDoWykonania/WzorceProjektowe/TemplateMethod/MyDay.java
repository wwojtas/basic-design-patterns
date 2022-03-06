package main.java.ZadaniaDoWykonania.WzorceProjektowe.TemplateMethod;

public class MyDay extends WeekDay{

    @Override
    protected void work() {
        System.out.println("Code monkey get up, get coffe");
    }

    @Override
    protected int goToWork(TransportType transportType) {
        switch(transportType) {
            case CAR:
                return 15;
            case BIKE:
                return 25;
            case TRAM:
                return 20;
            default:
                return 20;
        }
    }
}
