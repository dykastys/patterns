package decorator.phone_decorator;

import decorator.phone.Phone;
import decorator.phone_decorator.PhoneDecorator;

public class SmartPhone extends PhoneDecorator {

    public SmartPhone(Phone phone) {
        super(phone);
    }

    public String useTheInternet() {
        return "Use the internet. ";
    }

    @Override
    public String use() {
        return useTheInternet() + super.use();
    }
}
