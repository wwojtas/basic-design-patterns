package main.java.co.devfoundry;

import main.java.co.devfoundry.notification.Email;
import main.java.co.devfoundry.notification.MobileApp;
import main.java.co.devfoundry.notification.TextMessage;
import main.java.co.devfoundry.order.Order;
import main.java.co.devfoundry.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        textMessage.updateOrderStatus(order);
        mobileApp.updateOrderStatus(order);
        email.updateOrderStatus(order);
    }
}
