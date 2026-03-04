import java.util.List;

public class FourwheelerManager extends ParkingSpotManager {
    FourwheelerManager(List<ParkingSpot>FourWheelerspots){
        super(FourWheelerspots,new Randomespotstratergy());
    }
}
