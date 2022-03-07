package main.java.co.Patterns.Memento.smart_app;

class SmartAppMemento {

    private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    public Double getVersion() {
        return version;
    }
}
