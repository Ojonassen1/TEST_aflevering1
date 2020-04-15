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

        if (possition<700){
            Linje.getPoints().addAll(possition,-data.getSample());
            possition+=1;
        }else {
            Linje.getPoints().clear();
            possition=0.0;
        }

        //System.out.println("opdating line");
    }
}

