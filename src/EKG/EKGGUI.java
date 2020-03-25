package EKG;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.event.ActionEvent;
import javafx.scene.shape.Polyline;

import javax.swing.event.ChangeListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EKGGUI implements EKGListener{

    public javafx.scene.shape.Polyline Linje;
    private double possition =0.0;

    public void buttonPressed(ActionEvent actionEvent) throws Exception {
        EKGController.generator.register(this);

    }

    @Override
    public void notify(EKGData data) {
        Linje.getPoints().addAll(possition,10.0);
        possition+=1;
        System.out.println("opdating line");
    }
}

