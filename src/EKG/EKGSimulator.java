package EKG;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class EKGSimulator implements EKGsampler,Runnable {
    private EKGListener listener;

    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                if(listener!=null){
                    LocalDateTime now = LocalDateTime.now();
                    listener.notify(new EKGData(1000, new Timestamp(now.getNano()/1000)));
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void register(EKGListener listener) {

    }
}
