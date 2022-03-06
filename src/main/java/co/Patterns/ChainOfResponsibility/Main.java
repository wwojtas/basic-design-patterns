package main.java.co.Patterns.ChainOfResponsibility;

import main.java.co.Patterns.ChainOfResponsibility.message.Message;
import main.java.co.Patterns.ChainOfResponsibility.officer.*;

public class Main {
    public static void main(String[] args) {

        Message message = new Message("Atakować", 20, OfficerRank.GENERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        // ustawiamy łańcuch odpowiedzialności
        sergeant.setSuperriorOfficer(captain);
        captain.setSuperriorOfficer(general);

        sergeant.processMessage(message);



    }
}
