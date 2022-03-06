package main.java.co.Patterns.ChainOfResponsibility.officer;

import main.java.co.Patterns.ChainOfResponsibility.message.Message;

public abstract class Officer {

    private Officer superriorOfficer;
    public abstract void processMessage(Message message);

    public Officer getSuperriorOfficer() {
        return superriorOfficer;
    }

    public void setSuperriorOfficer(Officer superriorOfficer) {
        this.superriorOfficer = superriorOfficer;
    }
}
