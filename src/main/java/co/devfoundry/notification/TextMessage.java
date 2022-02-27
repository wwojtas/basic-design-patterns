package main.java.co.devfoundry.notification;

import main.java.co.devfoundry.order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order){
        System.out.println("SMS - zamowienie numer: " + order.getOrderNumber() + " zmieniło status na: "
                + order.getOrderStatus());
    }
}
