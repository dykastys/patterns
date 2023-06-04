package abstract_factory;

import abstract_factory.abstract_factory.AbstractFactory;
import abstract_factory.abstract_factory.DeliveryAbstractFactory;
import abstract_factory.deliverymans.Deliveryman;
import abstract_factory.deliverymans.DeliverymanType;
import abstract_factory.orders.Order;
import abstract_factory.orders.OrderType;

/*
* Для создания множеств взаимосвязанных или взаимозависимых объектов
* без жёсткой привязки к конкретным классам
* */
public class AbstractFactoryCollider {

    public static void main(String[] args) {
        AbstractFactory deliveryAbstractFactory = new DeliveryAbstractFactory();

        Order yandexOrder = deliveryAbstractFactory.createOrder(OrderType.YANDEX_ORDER);
        Deliveryman yandexDeliveryman = deliveryAbstractFactory.createDeliveryman(DeliverymanType.YANDEX_DELIVERYMAN);

        yandexOrder.process();
        yandexDeliveryman.deliver();

        System.out.println("\n===========================================\n");

        Order deliveryClubOrder = deliveryAbstractFactory.createOrder(OrderType.DELIVERY_CLUB_ORDER);
        Deliveryman deliveryClubDeliveryman = deliveryAbstractFactory.createDeliveryman(DeliverymanType.DELIVERY_CLUB_DELIVERYMAN);

        deliveryClubOrder.process();
        deliveryClubDeliveryman.deliver();
    }
}
