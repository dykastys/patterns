package creational.abstract_factory.abstract_factory;

import creational.abstract_factory.deliverymans.Deliveryman;
import creational.abstract_factory.deliverymans.DeliverymanType;
import creational.abstract_factory.orders.Order;
import creational.abstract_factory.orders.OrderType;

public interface AbstractFactory {

    Order createOrder(OrderType orderType);

    Deliveryman createDeliveryman(DeliverymanType deliverymanType);
}
