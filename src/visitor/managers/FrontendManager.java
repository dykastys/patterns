package visitor.managers;

import visitor.Helper;

public class FrontendManager implements Manager, Runnable {

    private String frontManageString = "default front manager";

    @Override
    public void run() {
        manage();
    }

    private void manage() {
        Helper.sleepRandomFiveSecond();
        this.frontManageString = "front manage string changed";
    }

    @Override
    public String getManageString() {
        return frontManageString;
    }
}
