package EKG;

public class PatientDataGenerator {
    public static double DummyPuls(){
        double puls = Math.floor(Math.random()*30)+50;
        return puls;
    }
    public static double DummySpO2(){
        double SpO2 = Math.floor(Math.random()*1)+99;
        return SpO2;
    }
    public static double DummyTemperatur() throws InterruptedException {
        int overst = 175;
        int nederst = 165;
        int range = overst - nederst + 1;
        double rand = Math.floor((double)Math.random() * range) + nederst;
        double temperatur = rand * 4 / 50 + 24;
        return temperatur;
    }
}
