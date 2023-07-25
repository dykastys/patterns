package creational.abstract_factory.deliverymans.impl;

import creational.abstract_factory.deliverymans.Deliveryman;

public class DeliveryClubDeliveryman implements Deliveryman {

    @Override
    public void deliver() {
        System.out.println("DeliveryClub deliveryman delivered...");
    }
}
