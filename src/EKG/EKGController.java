package EKG;

import javafx.beans.InvalidationListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.application.Application;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class EKGController extends Application implements EKGListener {
    public static EKGSimulator generator= new EKGSimulator();
    public static void main(String[] args) {
        /*Connection conn = MySQLConnector.getConn();
        try{
            Statement st = conn.createStatement();
            int id = 0;
            double temp = DummyTemperatur.DummyTemperatur();
            String insert = "INSERT INTO Temperatur VALUES ('"+id+"','"+temp+"')";
            st.executeUpdate(insert);
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        }*/
        EKGController ekgController = new EKGController();
        generator.register(ekgController);
        new Thread(generator).start();
        launch(args);

    }


    @Override
    public void notify(EKGData data) {
        //System.out.println("Got Data " + data.getSample());
        /*try {
            System.out.println(DummyTemperatur.DummyTemperatur());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EkgGUI.fxml"));
        AnchorPane anchorPane = loader.load();
        primaryStage.setScene(new Scene(anchorPane));
        primaryStage.show();

    }



}
