import java.util.List;

public abstract class ParkingSpotManager {
    protected List<ParkingSpot>spots;
    protected SpotStratergy stratergy;

    ParkingSpotManager(List<ParkingSpot>spots,SpotStratergy stratergy){
        this.spots = spots;
        this.stratergy = stratergy;
    }

    public boolean hasfree(){
        for(ParkingSpot spot : spots){
            if(spot.hasfree()){
                return true;
            }
        }
        return false;
    }

    public ParkingSpot park(){
        ParkingSpot spot = stratergy.selectspot(spots);
        if(spot == null) return null;
        spot.Ocuppyspot();
        return spot; 
    }

    public void unpark(ParkingSpot spot){
        spot.releasespot();
    }
}
