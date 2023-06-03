package visitor.entities;

import visitor.Helper;

public class FrontendManager implements Manager, Runnable {

    private String frontManageString = "default front manager";

    private void manage() {
        Helper.sleepRandomFiveSecond();
        this.frontManageString = "front manage string changed";
    }

    @Override
    public void run() {
        manage();
    }

    @Override
    public String getManageString() {
        return frontManageString;
    }
}
