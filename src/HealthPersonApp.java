import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthPersonApp {

    public static void main(String[] args) {
        Bruger Bente = new Doctor();
        Doctor doc = new Doctor();
        Bruger rachel = new Nurse();
        // det på højre skal være i forlængelse af det til venstre.
        //en doctor er et sundhedspersonel, men spl er ikke en doctor
        Bruger Christian = new Doctor();
       Bruger rasmus = new Nurse();
        // kan gøres pga. nurse og doctor extends

//giv objekter navne
        Bente.id = 1;
        doc.name = "Jørgen";
        rachel.name = "Rachel";
        rasmus.name = "Rasmus";

        // tilføj liste med objekter.
        List<Bruger> healthPersonnel = new ArrayList<Bruger>();
        healthPersonnel.addAll(Arrays.asList(Bente, doc, rachel));
        for (int i=0; i<healthPersonnel.size(); i++){
            if(healthPersonnel.get(i).getName().contains("Dr")){
                System.out.println(healthPersonnel.get(i).getName());
                //fjern ! hvis du vil have doktorer
                // hav hvis vil have Nurse også

            }



        }



    }

}
