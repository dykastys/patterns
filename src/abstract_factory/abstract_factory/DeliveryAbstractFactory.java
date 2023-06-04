package abstract_factory.abstract_factory;

import abstract_factory.deliverymans.Deliveryman;
import abstract_factory.deliverymans.DeliverymanType;
import abstract_factory.deliverymans.impl.DeliveryClubDeliveryman;
import abstract_factory.deliverymans.impl.YandexDeliveryman;
import abstract_factory.orders.Order;
import abstract_factory.orders.OrderType;
import abstract_factory.orders.impl.DeliveryClubOrder;
import abstract_factory.orders.impl.YandexOrder;

public class DeliveryAbstractFactory implements AbstractFactory {

    @Override
    public Order createOrder(OrderType orderType) {
        return switch (orderType) {
            case YANDEX_ORDER -> new YandexOrder();
            case DELIVERY_CLUB_ORDER -> new DeliveryClubOrder();
        };
    }

    @Override
    public Deliveryman createDeliveryman(DeliverymanType deliverymanType) {
        return switch (deliverymanType) {
            case YANDEX_DELIVERYMAN -> new YandexDeliveryman();
            case DELIVERY_CLUB_DELIVERYMAN -> new DeliveryClubDeliveryman();
        };
    }
}
