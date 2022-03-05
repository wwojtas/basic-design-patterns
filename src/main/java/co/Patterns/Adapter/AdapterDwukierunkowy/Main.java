package main.java.co.Patterns.Adapter.AdapterDwukierunkowy;

public class Main {
    public static void main(String[] args) {

        ContinentalSocket continentalSocket = new ContinentalSocket();
        UKSocket ukSocket = new UKSocket();

        UKDevice ukRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("Londyn calling to the faraway towns");
            }
        };

        ContinentalDevice continentalRadio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Londyn calling to the underworld\n");
            }
        };

        TwoWayAdapter adapter = new TwoWayAdapter(ukRadio, continentalRadio);

        continentalSocket.plugIn(adapter);
        ukSocket.plugIn(adapter);


    }
}
