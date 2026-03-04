import java.util.List;

public class TwowheelerManager extends ParkingSpotManager {
    
    TwowheelerManager(List<ParkingSpot>Twowheelerspots){
        super(Twowheelerspots,new Randomespotstratergy());
    }
}
