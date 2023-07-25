package structure.decorator.phone_decorator;

import structure.decorator.phone.Phone;

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
