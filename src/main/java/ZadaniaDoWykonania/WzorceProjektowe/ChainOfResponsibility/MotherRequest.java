package main.java.ZadaniaDoWykonania.WzorceProjektowe.ChainOfResponsibility;

public class MotherRequest {

    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
