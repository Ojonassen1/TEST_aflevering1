package EKG;

public class EKGController implements EKGListener {

    public static void main(String[] args) {
        EKGSimulator generator = new EKGSimulator();
        EKGController ekgController = new EKGController();
        generator.register(ekgController);
        new Thread(generator).start();
    }

    @Override
    public void notify(EKGData data) {
        System.out.println("Got Data"+ data.getSample());

    }
}
