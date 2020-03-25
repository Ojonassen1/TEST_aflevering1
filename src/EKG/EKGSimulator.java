package EKG;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class EKGSimulator implements EKGsampler,Runnable {
    private EKGListener listener;
    private final List<Double> data;

    public EKGSimulator(){
        DataSampleReader sampleReader = new DataSampleReaderSimImpl();
        this.data = sampleReader.loadData();
    }

    public void run(){
        for (int i = 0; i < data.size(); i++) {
            try{
                Thread.sleep(100);
                if(listener!=null){
                    LocalDateTime now = LocalDateTime.now();
                    listener.notify(
                            new EKGData(data.get(i), new Timestamp(LocalDateTime.now().getNano()/1000)));
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    @Override
    public void register(EKGListener listener) {
    this.listener = listener;
    }
}
