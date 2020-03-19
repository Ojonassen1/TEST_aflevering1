package EKG;

import javafx.beans.InvalidationListener;
import javafx.event.ActionEvent;

import java.nio.file.Paths;

public class EKGGUI {
    public javafx.scene.shape.Polyline Polyline;

    public void buttonPressed(ActionEvent actionEvent) throws InterruptedException {
        //System.out.println("Heeeej");
        // tager tid, så får sin egen tråd.
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Polyline.getPoints().addListener((InvalidationListener) Paths.get("/Users/kevinpedersen/IdeaProjects/TEST_aflevering1/src/EKG/EKG100Hz"));
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }).start();
    }
}
