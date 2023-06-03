package visitor.entities;

import visitor.Helper;

public class BackendManager implements Manager, Runnable {

    private String backManageString = "default back manager";

    private void manage() {
        Helper.sleepRandomFiveSecond();
        this.backManageString = "back manage string changed";
    }

    @Override
    public void run() {
        manage();
    }

    @Override
    public String getManageString() {
        return this.backManageString;
    }
}
