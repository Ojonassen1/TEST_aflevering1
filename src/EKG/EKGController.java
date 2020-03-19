package EKG;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;

public class EKGController implements EKGListener {

    public static void main(String[] args) {
        EKGSimulator generator = new EKGSimulator();
        EKGController ekgController = new EKGController();
        generator.register(ekgController);
        new Thread(generator).start();


    }

    @Override
    public void notify(EKGData data) {
        System.out.println("Got Data " + data.getSample());

    }

    public void start (Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EkgGUI.fxml"));

        AnchorPane anchorPane = loader.load();
        primaryStage.setScene(new Scene(anchorPane));
        primaryStage.show();

    }

}
