import java.util.Map;

public class ParkingLevel {
    Map<VehicleType,ParkingSpotManager>managers;
    int levelNumber;

    ParkingLevel(int levelNumber,Map<VehicleType,ParkingSpotManager>managers){
        this.levelNumber = levelNumber;
        this.managers = managers;
    }

    public boolean hasAvailability(VehicleType type){
        ParkingSpotManager manager = managers.get(type);
        return manager != null && manager.hasfree();
    }

    public ParkingSpot park(VehicleType type) {
        ParkingSpotManager manager = managers.get(type);
        if (manager == null) {
            throw new IllegalArgumentException(
                    "No parking manager for vehicle type: " + type);
        }
        return manager.park();
    }

    public void unPark(VehicleType type, ParkingSpot spot) {
        ParkingSpotManager manager = managers.get(type);
        if (manager != null) {
            manager.unpark(spot);
        }
    }

    public int getLevelNumber() {
        return levelNumber;
    }
}
