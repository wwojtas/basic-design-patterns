package main.java.co.devfoundry.notification;

import main.java.co.devfoundry.order.Order;

public class TextMessage implements Observer {

    public void update(Order order){
        System.out.println("SMS - zamowienie numer: " + order.getOrderNumber() + " zmieniło status na: "
                + order.getOrderStatus());
    }
}
