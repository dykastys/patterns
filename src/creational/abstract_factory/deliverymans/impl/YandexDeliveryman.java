package creational.abstract_factory.deliverymans.impl;

import creational.abstract_factory.deliverymans.Deliveryman;

public class YandexDeliveryman implements Deliveryman {

    @Override
    public void deliver() {
        System.out.println("Yandex deliveryman delivered...");
    }
}
