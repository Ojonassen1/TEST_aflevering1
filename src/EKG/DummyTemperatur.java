package EKG;

import javafx.scene.control.IndexRange;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.awt.*;

public class DummyTemperatur {

    public static double DummyTemperatur() throws InterruptedException {

            for (int i = 0; i < 100; i++) {

                try {

                int overst = 175;
                int nederst = 165;
                int range = overst - nederst + 1;
                double rand = Math.floor((double)Math.random() * range) + nederst;
                double temperatur = rand * 4 / 50 + 24;
                return temperatur;

            } catch (Exception e) {
                e.printStackTrace();
            }

            }
    return 0;
    }


}

