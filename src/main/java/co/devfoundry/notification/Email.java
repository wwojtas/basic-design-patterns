package main.java.co.devfoundry.notification;

import main.java.co.devfoundry.order.Order;

public class Email implements Observer {

    public void update(Order order) {
        System.out.println("Email - Zamowienie numer: " + order.getOrderNumber() + " zmieniło status na: "
                + order.getOrderStatus());
    }
}
