package main.java.co.Patterns.Obserwator.notification;

import main.java.co.Patterns.Obserwator.order.Order;

public interface Observer {

    void update(Order order);
}
