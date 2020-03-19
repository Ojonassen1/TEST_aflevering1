package EKG;

import java.util.List;

public interface DataSampleReader {
    List<Double> loadData();
}