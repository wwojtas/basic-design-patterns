package main.java.ZadaniaDoWykonania.WzorceProjektowe.ChainOfResponsibility;

public class ChildAnia extends Child{


    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania zdjęła słoik z półki");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
