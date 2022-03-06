package main.java.co.Patterns.ChainOfResponsibility.officer;

import main.java.co.Patterns.ChainOfResponsibility.message.Message;

public class Captain extends Officer{

    private static final int CODE = 50;
    private static final String NAME = "Kapitan Rokowski";

    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.CAPTAIN)
                && message.getCode() == CODE){
            System.out.println(NAME + " " + " otrzymał wiadomość: " + message.getContent());
        } else {
            getSuperriorOfficer().processMessage(message);
        }
    }
}
