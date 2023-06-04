package abstract_factory.orders.impl;

import abstract_factory.orders.Order;

public class YandexOrder implements Order {

    @Override
    public void process() {
        System.out.println("Create Yandex order...");
    }
}
