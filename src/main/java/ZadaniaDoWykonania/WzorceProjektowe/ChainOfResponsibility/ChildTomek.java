package main.java.ZadaniaDoWykonania.WzorceProjektowe.ChainOfResponsibility;

public class ChildTomek extends Child{


    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.MEDIUM)){
            System.out.println("Tomek zdjął słoik z półki");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
