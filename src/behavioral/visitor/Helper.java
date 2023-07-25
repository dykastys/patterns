package behavioral.visitor;

import java.util.Random;

public class Helper {

    public static void sleepRandomFiveSecond() {
        int sec = new Random().nextInt(5);
        try {
            Thread.sleep((sec + 1) * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
