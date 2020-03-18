public class Doctor extends Bruger{

    @Override
    public String getName() {
        String titel = "Dr." + super.getName();
        return titel;
// super = brug af metode
    }

}
