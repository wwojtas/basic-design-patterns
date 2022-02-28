package main.java.co.Patterns.Obserwator;

import main.java.co.Patterns.Obserwator.notification.Email;
import main.java.co.Patterns.Obserwator.notification.MobileApp;
import main.java.co.Patterns.Obserwator.notification.TextMessage;
import main.java.co.Patterns.Obserwator.order.Order;
import main.java.co.Patterns.Obserwator.order.OrderStatus;

public class Main {
    public static void main(String[] args) {


        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("--------------------");

        order.changeOrderStatus(OrderStatus.WYSLANE);

        order.unregisterObserver(email);

        System.out.println("--------------------");

        order.changeOrderStatus(OrderStatus.ODEBRANE);


    }
}
