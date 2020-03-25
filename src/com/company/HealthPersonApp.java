package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPaneBuilder;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthPersonApp extends Application {

    public static void main(String[] args) {
        Bruger bente = new Doctor();
        Bruger rachel = new Nurse();
        Bruger lasse = new Patient();
        // det på højre skal være i forlængelse af det til venstre.
        //en doctor er et sundhedspersonel, men spl er ikke en doctor
        // kan gøres pga. nurse og doctor extends

        //giv objekter navne
        lasse.name = "Lasse";
        lasse.id = 23456;
        bente.name = "Bente";
        bente.id = 12345;
        bente.password = 12345;
        rachel.name = "Rachel";
        rachel.id = 34567;


        // tilføj liste med objekter.
        List<Bruger> healthPersonnel = new ArrayList<>();
        healthPersonnel.addAll(Arrays.asList(bente, lasse, rachel));
        for (int i = 0; i < healthPersonnel.size(); i++) {
            // if(healthPersonnel.get(i).getName().contains("Dr")){
            System.out.println(healthPersonnel.get(i).getName());
            System.out.println(healthPersonnel.get(i).getId());
            //fjern ! hvis du vil have doktorer
            // hav hvis vil have com.company.Nurse også

        }

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
        primaryStage.setTitle("Sygedatabasen");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();


    }

}




