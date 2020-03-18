package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthPersonApp {

    public static void main(String[] args) {
        Bruger bente = new Doctor();
        Bruger rachel = new Nurse();
        Bruger lasse = new Patient();
        // det på højre skal være i forlængelse af det til venstre.
        //en doctor er et sundhedspersonel, men spl er ikke en doctor
        // kan gøres pga. nurse og doctor extends

        //giv objekter navne
        lasse.name = "Lasse";
        lasse.id= 23456;
        bente.name="Bente";
        bente.id = 12345;
        rachel.name = "Rachel";
        rachel.id=34567;


        // tilføj liste med objekter.
        List<Bruger> healthPersonnel = new ArrayList<Bruger>();
        healthPersonnel.addAll(Arrays.asList(bente, lasse, rachel));
        for (int i = 0; i < healthPersonnel.size(); i++) {
            // if(healthPersonnel.get(i).getName().contains("Dr")){
            System.out.println(healthPersonnel.get(i).getName());
            System.out.println(healthPersonnel.get(i).getId());
            //fjern ! hvis du vil have doktorer
            // hav hvis vil have com.company.Nurse også

        }


    }


}


