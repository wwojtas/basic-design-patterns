package main.java.ZadaniaDoWykonania.WzorceProjektowe.Builder;

public class FlightLeg {

    private final String from;
    private final String to;
    private boolean delayed;
    private int price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    public void setDelayed(boolean delayed){
        this.delayed = delayed;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                ", delayed=" + delayed +
                '}';
    }

    public static class FlightLegBuilder {

        private final String from;
        private final String to;
        private final boolean delayed;
        private int price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightLegBuilder price(int price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if(this.price == 0) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }

            return new FlightLeg(this);
        }
    }


}
