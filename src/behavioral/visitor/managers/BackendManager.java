package behavioral.visitor.managers;

import behavioral.visitor.Helper;

public class BackendManager implements Manager, Runnable {

    private String backManageString = "default back manager";

    @Override
    public void run() {
        manage();
    }

    private void manage() {
        Helper.sleepRandomFiveSecond();
        this.backManageString = "back manage string changed";
    }

    @Override
    public String getManageString() {
        return this.backManageString;
    }
}
