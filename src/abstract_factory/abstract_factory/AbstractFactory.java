package abstract_factory.abstract_factory;

import abstract_factory.deliverymans.Deliveryman;
import abstract_factory.deliverymans.DeliverymanType;
import abstract_factory.orders.Order;
import abstract_factory.orders.OrderType;

public interface AbstractFactory {

    Order createOrder(OrderType orderType);

    Deliveryman createDeliveryman(DeliverymanType deliverymanType);
}
