package main.java.co.devfoundry.notification;

import main.java.co.devfoundry.order.Order;

public class MobileApp {

    public void updateOrderStatus(Order order) {
        System.out.println("Aplikacja mobilna - Zamowienie numer: " + order.getOrderNumber() + " zmieniło status na: "
                + order.getOrderStatus());
    }
}
