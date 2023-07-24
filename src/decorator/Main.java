package decorator;

import decorator.phone.Phone;
import decorator.phone.PhoneImpl;
import decorator.phone_decorator.PhoneTable;
import decorator.phone_decorator.SmartPhone;

/**
 * Decorator позволяет добавлять новую функциональность объектам, не изменяя их исходный код.
 * Decorator является тем же объектом, который он декорирует, а так же содержит в себе этот объект.
 * */
public class Main {

    public static void main(String[] args) {
        Phone phone = new PhoneTable(
                                     new SmartPhone(
                                             new PhoneImpl()));

        System.out.println(phone.use());
    }
}
