package creational.abstract_factory.orders.impl;

import creational.abstract_factory.orders.Order;

public class DeliveryClubOrder implements Order {

    @Override
    public void process() {
        System.out.println("Create DeliveryClub order...");
    }
}
