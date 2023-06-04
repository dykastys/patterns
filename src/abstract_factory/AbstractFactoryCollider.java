package abstract_factory;

import abstract_factory.abstract_factory.DeliveryAbstractFactory;
import abstract_factory.deliverymans.Deliveryman;
import abstract_factory.deliverymans.DeliverymanType;
import abstract_factory.orders.Order;
import abstract_factory.orders.OrderType;

public class AbstractFactoryCollider {

    public static void main(String[] args) {
        DeliveryAbstractFactory deliveryAbstractFactory = new DeliveryAbstractFactory();

        Order yandexOrder = deliveryAbstractFactory.createOrder(OrderType.YANDEX_ORDER);
        Deliveryman ynadexDeliveryman = deliveryAbstractFactory.createDeliveryman(DeliverymanType.YANDEX_DELIVERYMAN);

        yandexOrder.process();
        ynadexDeliveryman.deliver();

        System.out.println("\n===========================================\n");

        Order deliveryClubOrder = deliveryAbstractFactory.createOrder(OrderType.DELIVERY_CLUB_ORDER);
        Deliveryman deliveryClubDeliveryman = deliveryAbstractFactory.createDeliveryman(DeliverymanType.DELIVERY_CLUB_DELIVERYMAN);

        deliveryClubOrder.process();
        deliveryClubDeliveryman.deliver();
    }
}