package structure.bridge;

import structure.bridge.developer.CppDeveloper;
import structure.bridge.developer.JavaDeveloper;
import structure.bridge.program.BankSystem;
import structure.bridge.program.Program;
import structure.bridge.program.StockExchange;

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
