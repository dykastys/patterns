package decorator.phone_decorator;

import decorator.phone.Phone;

public class PhoneDecorator implements Phone {

    private final Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String use() {
        return this.phone.use();
    }
}
