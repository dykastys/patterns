package structure.bridge.program;

import structure.bridge.developer.Developer;

public class StockExchange extends Program{

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange in progress...");
        this.developer.writeCode();
    }
}
