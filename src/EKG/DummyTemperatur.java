package EKG;

import java.awt.*;

public class DummyTemperatur {

    public static double DummyTemperatur() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            int overst = 180;
            int nederst = 160;
            int range = overst - nederst + 1;
            double rand = ((double) Math.random() * range) + nederst;
            double temperatur = rand * 4 / 50 + 24;
            return temperatur;
        }Thread.sleep(1000);
    return 0;
    }
}

