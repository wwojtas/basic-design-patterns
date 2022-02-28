package main.java.co.Patterns.Obserwator.notification;

import main.java.co.Patterns.Obserwator.order.Order;

public class MobileApp implements Observer {

    public void update(Order order) {
        System.out.println("Aplikacja mobilna - Zamowienie numer: " + order.getOrderNumber() + " zmieniło status na: "
                + order.getOrderStatus());
    }
}
