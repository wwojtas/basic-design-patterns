package main.java.ZadaniaDoWykonania.WzorceProjektowe.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);
        Child tomek = new ChildTomek();
        Child ania = new ChildAnia();
        Child antek = new ChildAntek();
        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);
        tomek.processRequest(motherRequest);

    }
}
