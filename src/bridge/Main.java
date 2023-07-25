package bridge;

import bridge.developer.CppDeveloper;
import bridge.developer.JavaDeveloper;
import bridge.program.BankSystem;
import bridge.program.Program;
import bridge.program.StockExchange;

/**
 * Нужен, чтобы отделить абстракцию от реализации таким образом, чтобы мы
 * могли изменять и то и другое независимо друг от друга.
 * */
public class Main {

    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for(Program program : programs) {
            program.developProgram();
        }
    }
}
