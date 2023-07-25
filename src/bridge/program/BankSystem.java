package bridge.program;

import bridge.developer.Developer;

public class BankSystem extends Program {

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        this.developer.writeCode();
    }
}
