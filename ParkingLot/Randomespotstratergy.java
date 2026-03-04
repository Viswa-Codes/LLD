import java.util.List;

public class Randomespotstratergy implements SpotStratergy {

    @Override
    public ParkingSpot selectspot(List<ParkingSpot>spots){
        for(ParkingSpot spot : spots){
            if(spot.hasfree()){
                return spot;
            }
        }
        return null;
    }
}
