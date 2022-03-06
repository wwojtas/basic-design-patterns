package main.java.ZadaniaDoWykonania.WzorceProjektowe.ChainOfResponsibility;

public class ChildAntek extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.HIGH)){
            System.out.println("Antek zdjął słoik z półki");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
