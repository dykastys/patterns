package structure.decorator.phone_decorator;

import structure.decorator.phone.Phone;

public class PhoneTable extends PhoneDecorator {

    public PhoneTable(Phone phone) {
        super(phone);
    }

    public String readTheBook() {
        return "Read the book. ";
    }

    @Override
    public String use() {
        return readTheBook() + super.use();
    }
}
