package main.java.co.devfoundry.notification;

import main.java.co.devfoundry.order.Order;

public interface Observer {

    void update(Order order);
}
