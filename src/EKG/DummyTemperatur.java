package EKG;

import javafx.scene.control.IndexRange;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.awt.*;

public class DummyTemperatur implements EKGListener {

    public static double DummyTemperatur() throws InterruptedException {

            for (int i = 0; i < 100; i++) {

                try {

                int overst = 180;
                int nederst = 160;
                int range = overst - nederst + 1;
                double rand = ((double)Math.random() * range) + nederst;
                double temperatur = rand * 4 / 50 + 24;
                return temperatur;

            } catch (Exception e) {
                e.printStackTrace();
            }

            }
    return 0;
    }

    @Override
    public void notify(EKGData data) {



    }
}

